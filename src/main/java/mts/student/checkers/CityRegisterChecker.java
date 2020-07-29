package mts.student.checkers;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import mts.student.config.Config;
import mts.student.domain.entity.Child;
import mts.student.domain.entity.Person;
import mts.student.domain.entity.StudentOrder;
import mts.student.domain.register.city.AnswerCityRegister;
import mts.student.domain.register.city.CityRegisterRequest;
import mts.student.domain.register.city.CityRegisterResponse;
import mts.student.exception.CityRegException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;


/**
 * Класс предназначен для выполнения проверки регистрации
 * Собирает запрос
 * Передаёт отправщику
 * Получает и трактует ответ
 */

public class CityRegisterChecker {

    private static final Logger logger =
            LoggerFactory.getLogger(CityRegisterChecker.class);

    public AnswerCityRegister checkRegistration(StudentOrder so) throws CityRegException {

        AnswerCityRegister answerCityRegister =  new AnswerCityRegister();

        answerCityRegister.addItem(checkPerson(so.getHusband()));
        answerCityRegister.addItem(checkPerson(so.getWife()));
        for (Child child : so.getChild()) {
            answerCityRegister.addItem(checkPerson(child));
        }

        return answerCityRegister;
    }


    public CityRegisterResponse checkPerson(Person person)
            throws CityRegException {

        try {
            CityRegisterRequest request = new CityRegisterRequest(person);

            Client client = ClientBuilder.newClient();
            CityRegisterResponse response = client.target(
                    Config.getProp(Config.CR_URL))
                    .request(MediaType.APPLICATION_JSON)
                    .header(HttpHeaders.ACCEPT_CHARSET, "UTF-8")
                    .post(Entity.entity(request, MediaType.APPLICATION_JSON))
                    .readEntity(CityRegisterResponse.class);

            return response;
        } catch (Exception e) {
            throw new CityRegException("410", e.getMessage(), e);
        }



    }



}
