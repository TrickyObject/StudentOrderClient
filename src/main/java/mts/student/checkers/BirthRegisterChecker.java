package mts.student.checkers;

import mts.student.config.Config;
import mts.student.domain.entity.Person;
import mts.student.domain.entity.StudentOrder;
import mts.student.domain.register.birth.BirthRegisterRequest;
import mts.student.domain.register.birth.BirthRegisterResponse;
import mts.student.domain.register.birth.BirthRegisterResult;
import mts.student.domain.register.marriage.MarriageRegisterRequest;
import mts.student.domain.register.marriage.MarriageRegisterResponse;
import mts.student.domain.register.marriage.MarriageRegisterResult;
import mts.student.exception.BirthRegException;
import mts.student.exception.MarriageRegisterException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

public class BirthRegisterChecker {

    private static final Logger logger =
            LoggerFactory.getLogger(CityRegisterChecker.class);

    private StringBuilder answer;

    public BirthRegisterResult checkRegistration(StudentOrder so) {

        BirthRegisterResult birthRegisterResult =  new BirthRegisterResult();

        cityRegisterResult.setDecision(false);
// TODO: передавать сертификаты о рождении
        try {
            if (checkPerson(so.getHusband()).isMarried() != false) {
                cityRegisterResult.setDecision(true);
                cityRegisterResult.getError().append("Child registered");
            }

        } catch (BirthRegException e) {
            e.printStackTrace();
        }

        return cityRegisterResult;
    }


    public BirthRegisterResponse checkPerson(Person person)
            throws MarriageRegisterException {

        try {
            BirthRegisterRequest request = new BirthRegisterRequest(person);

            Client client = ClientBuilder.newClient();
            BirthRegisterResponse response = client.target(
                    Config.getProp(Config.MRB_URL))
                    .request(MediaType.APPLICATION_JSON)
                    .header(HttpHeaders.ACCEPT_CHARSET, "UTF-8")
                    .post(Entity.entity(request, MediaType.APPLICATION_JSON))
                    .readEntity(BirthRegisterResponse.class);

            return response;
        } catch (Exception e) {
            throw new MarriageRegisterException("410", e.getMessage(), e);
        }



    }
}
