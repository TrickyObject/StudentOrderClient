package mts.student.checkers;

import mts.student.domain.entity.StudentOrder;
import mts.student.domain.register.city.AnswerCityRegister;
import mts.student.domain.register.city.CityRegisterResponse;
import mts.student.exception.CityRegException;


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


    // Проверка во всех структурах
    public void checkOneOrder(StudentOrder so) {

        CityRegisterResponse cityAnswer = checkRegistration(so);

    }

    // проверка регистрации
    public CityRegisterResponse checkRegistration(StudentOrder so) {
        return cityRegisterChecker.checkRegistration(so);

    }

}
