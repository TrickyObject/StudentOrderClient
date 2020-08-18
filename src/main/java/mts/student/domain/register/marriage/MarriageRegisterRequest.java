package mts.student.domain.register.marriage;

import mts.student.domain.entity.Adress;
import mts.student.domain.entity.Person;
import mts.student.util.LocalDateAdapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

public class MarriageRegisterRequest {

    private String husbandSurName;
    private String husbandGivenName;
    private String husbandPatronymicName;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate husbandDateOfBirth;
    private String husbandPassportSerial;
    private String husbandPassportNumber;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate husbandPassportDate;

    private String wifeSurName;
    private String wifeGivenName;
    private String wifePatronymicName;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate wifeDateOfBirth;
    private String wifePassportSerial;
    private String wifePassportNumber;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate wifePassportDate;

    private String marriageCertNumber;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private String marriageCertDate;

    @Override
    public String toString() {
        return "MarriageRegisterRequest{" +
                "husbandSurName='" + husbandSurName + '\'' +
                ", husbandGivenName='" + husbandGivenName + '\'' +
                ", husbandPatronymicName='" + husbandPatronymicName + '\'' +
                ", husbandDateOfBirth=" + husbandDateOfBirth +
                ", husbandPassportSerial='" + husbandPassportSerial + '\'' +
                ", husbandPassportNumber='" + husbandPassportNumber + '\'' +
                ", husbandPassportDate=" + husbandPassportDate +
                ", wifeSurName='" + wifeSurName + '\'' +
                ", wifeGivenName='" + wifeGivenName + '\'' +
                ", wifePatronymicName='" + wifePatronymicName + '\'' +
                ", wifeDateOfBirth=" + wifeDateOfBirth +
                ", wifePassportSerial='" + wifePassportSerial + '\'' +
                ", wifePassportNumber='" + wifePassportNumber + '\'' +
                ", wifePassportDate=" + wifePassportDate +
                ", marriageCertNumber='" + marriageCertNumber + '\'' +
                ", marriageCertDate='" + marriageCertDate + '\'' +
                '}';
    }

    public String getHusbandSurName() {
        return husbandSurName;
    }

    public void setHusbandSurName(String husbandSurName) {
        this.husbandSurName = husbandSurName;
    }

    public String getHusbandGivenName() {
        return husbandGivenName;
    }

    public void setHusbandGivenName(String husbandGivenName) {
        this.husbandGivenName = husbandGivenName;
    }

    public String getHusbandPatronymicName() {
        return husbandPatronymicName;
    }

    public void setHusbandPatronymicName(String husbandPatronymicName) {
        this.husbandPatronymicName = husbandPatronymicName;
    }

    public LocalDate getHusbandDateOfBirth() {
        return husbandDateOfBirth;
    }

    public void setHusbandDateOfBirth(LocalDate husbandDateOfBirth) {
        this.husbandDateOfBirth = husbandDateOfBirth;
    }

    public String getHusbandPassportSerial() {
        return husbandPassportSerial;
    }

    public void setHusbandPassportSerial(String husbandPassportSerial) {
        this.husbandPassportSerial = husbandPassportSerial;
    }

    public String getHusbandPassportNumber() {
        return husbandPassportNumber;
    }

    public void setHusbandPassportNumber(String husbandPassportNumber) {
        this.husbandPassportNumber = husbandPassportNumber;
    }

    public LocalDate getHusbandPassportDate() {
        return husbandPassportDate;
    }

    public void setHusbandPassportDate(LocalDate husbandPassportDate) {
        this.husbandPassportDate = husbandPassportDate;
    }

    public String getWifeSurName() {
        return wifeSurName;
    }

    public void setWifeSurName(String wifeSurName) {
        this.wifeSurName = wifeSurName;
    }

    public String getWifeGivenName() {
        return wifeGivenName;
    }

    public void setWifeGivenName(String wifeGivenName) {
        this.wifeGivenName = wifeGivenName;
    }

    public String getWifePatronymicName() {
        return wifePatronymicName;
    }

    public void setWifePatronymicName(String wifePatronymicName) {
        this.wifePatronymicName = wifePatronymicName;
    }

    public LocalDate getWifeDateOfBirth() {
        return wifeDateOfBirth;
    }

    public void setWifeDateOfBirth(LocalDate wifeDateOfBirth) {
        this.wifeDateOfBirth = wifeDateOfBirth;
    }

    public String getWifePassportSerial() {
        return wifePassportSerial;
    }

    public void setWifePassportSerial(String wifePassportSerial) {
        this.wifePassportSerial = wifePassportSerial;
    }

    public String getWifePassportNumber() {
        return wifePassportNumber;
    }

    public void setWifePassportNumber(String wifePassportNumber) {
        this.wifePassportNumber = wifePassportNumber;
    }

    public LocalDate getWifePassportDate() {
        return wifePassportDate;
    }

    public void setWifePassportDate(LocalDate wifePassportDate) {
        this.wifePassportDate = wifePassportDate;
    }

    public String getMarriageCertNumber() {
        return marriageCertNumber;
    }

    public void setMarriageCertNumber(String marriageCertNumber) {
        this.marriageCertNumber = marriageCertNumber;
    }

    public String getMarriageCertDate() {
        return marriageCertDate;
    }

    public void setMarriageCertDate(String marriageCertDate) {
        this.marriageCertDate = marriageCertDate;
    }
}
