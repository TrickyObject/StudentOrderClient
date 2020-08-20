package mts.student.checkers;

import mts.student.domain.entity.StudentOrder;


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
    private StudentRegisterChecker studentRegisterChecker;

    private boolean cityRegisterResult;
    private boolean studentRegisterResult;
    private boolean result;

    public All() {
        cityRegisterChecker = new CityRegisterChecker();
        studentRegisterChecker = new StudentRegisterChecker();
    }

    //обработка одной заявки
    public void processStudentOrder (StudentOrder so) {

        result = checkOneOrder(so);

        writeOneOrder(so, result);

    }


    // Проверка во всех структурах
    public boolean checkOneOrder(StudentOrder so) {

//        cityRegisterResult = checkRegistration(so);
        studentRegisterResult = checkStudying(so);

        if (studentRegisterResult) {
            return true;
        }

//        if (cityRegisterResult && studentRegisterResult) {
//            return true;
//        }

        return false;
    }

    // проверка регистрации
    public boolean checkRegistration(StudentOrder so) {
        return cityRegisterChecker.checkRegistration(so).isDecision();
    }

    public boolean checkStudying (StudentOrder so) {
        return studentRegisterChecker.checkStudentRegistration(so).isDecision();
    }






    // запись результата в БД
    private void writeOneOrder(StudentOrder so, boolean result) {

        System.out.println(so.getStudentOrderId() + " " + result);

    }

}
