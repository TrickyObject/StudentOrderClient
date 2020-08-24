package mts.student.checkers;

import mts.student.config.Config;
import mts.student.domain.entity.BirthCertificate;
import mts.student.domain.entity.Child;
import mts.student.domain.entity.StudentOrder;
import mts.student.domain.register.birth.BirthRegisterRequest;
import mts.student.domain.register.birth.BirthRegisterResponse;
import mts.student.domain.register.birth.BirthRegisterResult;
import mts.student.exception.BirthRegException;
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

    public BirthRegisterResult checkBirthRegistration(StudentOrder so) {

        BirthRegisterResult birthRegisterResult =  new BirthRegisterResult();

        birthRegisterResult.setDecision(false);

        for (Child child : so.getChild()) {

            BirthCertificate birthCertificate =
                    new BirthCertificate(so.getHusband(), so.getWife(), child);

            try {
                if (checkBirthRegistration(birthCertificate).isBorn() != false) {
                    birthRegisterResult.setDecision(true);
                    birthRegisterResult.getError().append("Child registered");
                }

            } catch (BirthRegException e) {
                e.printStackTrace();
            }

        }

        return birthRegisterResult;
    }


    public BirthRegisterResponse checkBirthRegistration(BirthCertificate birthCertificate)
            throws BirthRegException {

        try {
            BirthRegisterRequest request = new BirthRegisterRequest(birthCertificate);

            Client client = ClientBuilder.newClient();
            BirthRegisterResponse response = client.target(
                    Config.getProp(Config.MRB_URL))
                    .request(MediaType.APPLICATION_JSON)
                    .header(HttpHeaders.ACCEPT_CHARSET, "UTF-8")
                    .post(Entity.entity(request, MediaType.APPLICATION_JSON))
                    .readEntity(BirthRegisterResponse.class);

            return response;
        } catch (Exception e) {
            throw new BirthRegException("410", e.getMessage(), e);
        }



    }


}
