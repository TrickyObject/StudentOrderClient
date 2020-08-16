package mts.student.checkers;

import mts.student.config.Config;
import mts.student.domain.entity.Child;
import mts.student.domain.entity.Person;
import mts.student.domain.entity.StudentOrder;
import mts.student.domain.register.city.CityRegisterRequest;
import mts.student.domain.register.city.CityRegisterResponse;
import mts.student.domain.register.city.CityRegisterResult;
import mts.student.exception.CityRegException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

    private StringBuilder answer;

    public CityRegisterResult checkRegistration(StudentOrder so) {


        CityRegisterResult cityRegisterResult =  new CityRegisterResult();

        cityRegisterResult.setDecision(false);

        try {
            if (checkPerson(so.getHusband()).isRegistered() == false) {
                cityRegisterResult.setDecision(false);
                cityRegisterResult.getError().append("Husband not registered");
            }

            if (checkPerson(so.getWife()).isRegistered() == false) {
                cityRegisterResult.setDecision(false);
                cityRegisterResult.getError().append("Wife not registered");
            }

            for (Child child : so.getChild()) {

                if (checkPerson(child).isRegistered() == false) {
                    cityRegisterResult.setDecision(false);
                    cityRegisterResult.getError().append(child.getFirstName() + ' '
                            + child.getSecondName()
                            + " not registered");
                }
            }

        } catch (CityRegException e) {
            e.printStackTrace();
        }

        return cityRegisterResult;
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
