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

    public All() {
    //    cityRegisterValidator = new CityRegisterValidator();
        cityRegisterChecker = new CityRegisterChecker();
    }

    //обработка одной заявки
    public void processStudentOrder (StudentOrder so) {

        CityRegisterResponse response = checkOneOrder(so);



        writeOneOrder(so, response);

    }


    // Проверка во всех структурах
    public CityRegisterResponse checkOneOrder(StudentOrder so) {

        CityRegisterResponse cityAnswer = checkRegistration(so);

    }

    // проверка регистрации
    public CityRegisterResponse checkRegistration(StudentOrder so) {
        return cityRegisterChecker.checkRegistration(so);

    }

    // запись результата в БД
    private void writeOneOrder(StudentOrder so, CityRegisterResponse response) {

    }

}
