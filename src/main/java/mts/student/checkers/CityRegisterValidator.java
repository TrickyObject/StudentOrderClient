package mts.student.checkers;


import mts.student.domain.entity.Child;
import mts.student.domain.entity.Person;
import mts.student.domain.entity.StudentOrder;
import mts.student.domain.register.city.CityRegisterResponse;
import mts.student.exception.CityRegException;

public class CityRegisterValidator {

    public String host;
    public String login;
    public String pwd;
    public static final String IN_CODE = "NO_GRN";

    private CityRegisterChecker pChecker;

    public CityRegisterValidator() {

        pChecker = new CityRegisterChecker();
    }

    public AnswerCityRegister checkRegistration(StudentOrder so) {

        AnswerCityRegister answerCityRegister =  new AnswerCityRegister();

        answerCityRegister.addItem(checkPerson(so.getHusband()));
        answerCityRegister.addItem(checkPerson(so.getWife()));
        for (Child child : so.getChild()) {
            answerCityRegister.addItem(checkPerson(child));
        }

        return answerCityRegister;
    }

    private AnswerCityRegisterItem checkPerson(Person person) {

        AnswerCityRegisterItem.CityState state = null;
        AnswerCityRegisterItem.CityError error = null;

        try {
            CityRegisterResponse tmp = pChecker.checkPerson(person);
            state = tmp.isRegistered() ?
                    AnswerCityRegisterItem.CityState.YES :
                    AnswerCityRegisterItem.CityState.NO;

        } catch (CityRegException e) {
            e.printStackTrace(System.out);
            state = AnswerCityRegisterItem.CityState.ERROR;
            error = new AnswerCityRegisterItem.CityError(e.getCode(), e.getMessage());

        }

        AnswerCityRegisterItem ans = new AnswerCityRegisterItem(state, person, error);

        return ans;
//        return null;
    }
}

/*
*
            for (int i = 0; i < so.getChild().size(); i++) {
                CityRegisterCheckerResponse ca = pChecker.checkPerson(so.getChild().get(i));
            }

            for(Iterator<Child> it = so.getChild().iterator(); it.hasNext();) {
                Child child = it.next();
                CityRegisterCheckerResponse ca = pChecker.checkPerson(child);
            }


             for (Child child : children) {
                CityRegisterCheckerResponse cAns = pChecker.checkPerson(child);
            }
* */