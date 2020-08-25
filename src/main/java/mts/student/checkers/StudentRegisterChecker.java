package mts.student.checkers;

import mts.student.config.Config;
import mts.student.domain.entity.Adult;
import mts.student.domain.entity.Person;
import mts.student.domain.entity.StudentOrder;
import mts.student.domain.register.marriage.MarriageRegisterRequest;
import mts.student.domain.register.marriage.MarriageRegisterResponse;
import mts.student.domain.register.marriage.MarriageRegisterResult;
import mts.student.domain.register.student.StudentRegisterRequest;
import mts.student.domain.register.student.StudentRegisterResponse;
import mts.student.domain.register.student.StudentRegisterResult;
import mts.student.exception.MarriageRegisterException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

public class StudentRegisterChecker {

    private static final Logger logger =
            LoggerFactory.getLogger(CityRegisterChecker.class);

    private StringBuilder answer;

    public StudentRegisterResult checkStudentRegistration(StudentOrder so) {

        StudentRegisterResult studentRegisterResult =  new StudentRegisterResult();

        studentRegisterResult.setDecision(true);

        try {
            if (checkPerson(so.getHusband()).isStudying() == false) {
                studentRegisterResult.setDecision(false);
                studentRegisterResult.getError().append("Husband isn't studnet");
            }

            if (checkPerson(so.getHusband()).isStudying() == false) {
                studentRegisterResult.setDecision(false);
                studentRegisterResult.getError().append("Wife isn't student");
            }

        } catch (MarriageRegisterException e) {
            e.printStackTrace();
        }

        return studentRegisterResult;
    }

    public StudentRegisterResponse checkPerson(Adult person)
            throws MarriageRegisterException {

        try {
            StudentRegisterRequest request = new StudentRegisterRequest(person);

            Client client = ClientBuilder.newClient();
            StudentRegisterResponse response = client.target(
                    Config.getProp(Config.SR_URL))
                    .request(MediaType.APPLICATION_JSON)
                    .header(HttpHeaders.ACCEPT_CHARSET, "UTF-8")
                    .post(Entity.entity(request, MediaType.APPLICATION_JSON))
                    .readEntity(StudentRegisterResponse.class);

            logger.info(request.toString());

            return response;
        } catch (Exception e) {
            // TODO: refactor
            throw new MarriageRegisterException("410", e.getMessage(), e);
        }



    }
}
