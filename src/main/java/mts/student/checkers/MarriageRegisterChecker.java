package mts.student.checkers;

import mts.student.config.Config;
import mts.student.domain.entity.MarriageCertificate;
import mts.student.domain.entity.StudentOrder;

import mts.student.domain.register.marriage.MarriageRegisterRequest;
import mts.student.domain.register.marriage.MarriageRegisterResponse;
import mts.student.domain.register.marriage.MarriageRegisterResult;
import mts.student.exception.MarriageRegisterException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

public class MarriageRegisterChecker {

    private static final Logger logger =
            LoggerFactory.getLogger(CityRegisterChecker.class);

    private StringBuilder answer;

    public MarriageRegisterResult checkMarriageRegistration(StudentOrder so) {

        logger.info("checkMarriageRegistration");

        MarriageRegisterResult marriageRegisterResult =  new MarriageRegisterResult();

        marriageRegisterResult.setDecision(false);

        try {
            MarriageCertificate marriageCertificate = new MarriageCertificate(so);

            if (checkMarriageRegistration(marriageCertificate).isMarried() == true) {
                marriageRegisterResult.setDecision(true);
                marriageRegisterResult.getError().append("Marriage registered");
                logger.info("Marriage registered");
            }

        } catch (MarriageRegisterException e) {
            e.printStackTrace();
        }

        logger.info("marriageRegisterResult = " + marriageRegisterResult.isDecision());

        return marriageRegisterResult;
    }


    public MarriageRegisterResponse checkMarriageRegistration(MarriageCertificate marriageCertificate)
            throws MarriageRegisterException {

        logger.info("checkMarriageRegistration");

        try {
            MarriageRegisterRequest request = new MarriageRegisterRequest(marriageCertificate);

            logger.info("Try send marriage cert");

            Client client = ClientBuilder.newClient();
            MarriageRegisterResponse response = client.target(
                    Config.getProp(Config.MRM_URL))
                    .request(MediaType.APPLICATION_JSON)
                    .header(HttpHeaders.ACCEPT_CHARSET, "UTF-8")
                    .post(Entity.entity(request, MediaType.APPLICATION_JSON))
                    .readEntity(MarriageRegisterResponse.class);

            logger.info("Request = " + request.toString());

            logger.info("Response = " + response.isMarried());

            return response;
        } catch (Exception e) {
            throw new MarriageRegisterException("410", e.getMessage(), e);
        }



    }


}
