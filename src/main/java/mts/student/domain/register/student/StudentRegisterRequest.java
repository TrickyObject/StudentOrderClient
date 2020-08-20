package mts.student.domain.register.student;

import mts.student.domain.entity.Adult;
import mts.student.domain.entity.Person;
import mts.student.util.LocalDateAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

public class StudentRegisterRequest {

    private String surName;
    private String givenName;
    private String patronymicName;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate dateOfBirth;
    private String passportSerial;
    private String passportNumber;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate passportDate;
//    private String documentNumber;
//    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
//    private LocalDate documentDate;
//    private String university;
//    private String faculty;


    public StudentRegisterRequest() {
    }

    public StudentRegisterRequest(Adult adult) {
        this.surName = adult.getFirstName();
        this.givenName = adult.getSecondName();
        this.patronymicName = adult.getPatronymicName();
        this.dateOfBirth = adult.getBirthDay();
        this.passportSerial = adult.getPassportSerial();
        this.passportNumber = adult.getPassportNum();
        this.passportDate = adult.getPassportDate();
    }

    @Override
    public String toString() {
        return "StudentRegisterRequest{" +
                "surName='" + surName + '\'' +
                ", givenName='" + givenName + '\'' +
                ", patronymicName='" + patronymicName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", passportSerial='" + passportSerial + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", passportDate=" + passportDate +
                '}';
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassportSerial() {
        return passportSerial;
    }

    public void setPassportSerial(String passportSerial) {
        this.passportSerial = passportSerial;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getPassportDate() {
        return passportDate;
    }

    public void setPassportDate(LocalDate passportDate) {
        this.passportDate = passportDate;
    }


}
