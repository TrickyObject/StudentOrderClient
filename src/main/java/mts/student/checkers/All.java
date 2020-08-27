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
    private BirthRegisterChecker birthRegisterChecker;
    private MarriageRegisterChecker marriageRegisterChecker;

    private boolean cityRegisterResult;
    private boolean studentRegisterResult;
    private boolean birthRegisterResult;
    private boolean marriageRegisterResult;
    private boolean result;

    public All() {

        cityRegisterChecker = new CityRegisterChecker();
        studentRegisterChecker = new StudentRegisterChecker();
        birthRegisterChecker = new BirthRegisterChecker();
        marriageRegisterChecker = new MarriageRegisterChecker();

    }

    //обработка одной заявки
    public void processStudentOrder (StudentOrder so) {

        result = checkOneOrder(so);

        writeOneOrder(so, result);

    }


    // Проверка во всех структурах
    public boolean checkOneOrder(StudentOrder so) {

//        NOT OK
//        cityRegisterResult = checkRegistration(so);

//        NOT OK
//        studentRegisterResult = checkStudying(so);

//        OK
//        birthRegisterResult = checkBirth(so);

//        OK
        marriageRegisterResult = checkMarriage(so);


        if (marriageRegisterResult) {
            return true;
        }

//        if (cityRegisterResult && studentRegisterResult) {
//            return true;
//        }

        return false;
    }

    public boolean checkRegistration(StudentOrder so) {
        return cityRegisterChecker.checkRegistration(so).isDecision();
    }

    public boolean checkStudying (StudentOrder so) {
        return studentRegisterChecker.checkStudentRegistration(so).isDecision();
    }

    public boolean checkBirth (StudentOrder so) {
        return birthRegisterChecker.checkBirthRegistration(so).isDecision();
    }

    public boolean checkMarriage (StudentOrder so) {
        return marriageRegisterChecker.checkMarriageRegistration(so).isDecision();
    }



    // запись результата в БД
    private void writeOneOrder(StudentOrder so, boolean result) {

        System.out.println(so.getStudentOrderId() + " " + result);

    }

}
