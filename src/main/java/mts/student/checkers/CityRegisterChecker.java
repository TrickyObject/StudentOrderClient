package mts.student.checkers;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import mts.student.config.Config;
import mts.student.domain.entity.Person;
import mts.student.domain.register.city.CityRegisterRequest;
import mts.student.domain.register.city.CityRegisterResponse;
import mts.student.exception.CityRegException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import java.awt.*;

/**
 * Класс предназначен для выполнения проверки регистрации
 * Собирает запрос
 * Передаёт отправщику
 * Получает и трактует ответ
 */

public class CityRegisterChecker {

    private static final Logger logger =
            LoggerFactory.getLogger(CityRegisterChecker.class);

    public CityRegisterResponse checkPerson(Person person)
            throws CityRegException {

        try {
            CityRegisterRequest request = new CityRegisterRequest(person);

            Client client = ClientBuilder.newClient();
            CityRegisterResponse response = client.target(
                    Config.getProp(Config.CR_URL))
                    .request(MediaType.APPLICATION_JSON)
                    .post(Entity.entity(request, MediaType.APPLICATION_JSON))
                    .readEntity(CityRegisterResponse.class);

            return response;
        } catch (Exception e) {
            throw new CityRegException("410", e.getMessage(), e);
        }



    }



}
