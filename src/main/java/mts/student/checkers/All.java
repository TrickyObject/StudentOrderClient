package mts.student.checkers;

import mts.student.dao.StudentOrderDaoImpl;
import mts.student.domain.entity.StudentOrder;
import mts.student.exception.DaoException;

import java.util.List;

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

    }





    public void checkOneOrder(StudentOrder so) {
        AnswerCityRegister cityAnswer = checkRegistration(so);
    }

    public AnswerCityRegister checkRegistration(StudentOrder so) {
        return cityRegisterChecker.checkRegistration(so);
    }

}
