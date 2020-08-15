package mts.student.checkers;

import mts.student.domain.entity.StudentOrder;
import mts.student.domain.register.city.CityRegisterResponse;


/**
 * Класс предназначен для проверки:
 *
 * студенты действительно студенты
 * студенты имеют действующую регистрация в городе
 * студенты - муж и жена
 * студенты имеют детей
 *
 */

public class All {

    private CityRegisterChecker cityRegisterChecker;
    private boolean cityRegisterResult;
    private boolean result;

    public All() {
    //    cityRegisterValidator = new CityRegisterValidator();
        cityRegisterChecker = new CityRegisterChecker();
    }

    //обработка одной заявки
    public void processStudentOrder (StudentOrder so) {

        result = checkOneOrder(so);



        writeOneOrder(so, result);

    }


    // Проверка во всех структурах
    public boolean checkOneOrder(StudentOrder so) {

        cityRegisterResult = checkRegistration(so);

        if (cityRegisterResult) {
            return true;
        }

        return false;
    }

    // проверка регистрации
    public boolean checkRegistration(StudentOrder so) {

        return cityRegisterChecker.checkRegistration(so).isDecision();

    }

    // запись результата в БД
    private void writeOneOrder(StudentOrder so, boolean result) {

        System.out.println(so.getStudentOrderId() + " " + result);

    }

}
