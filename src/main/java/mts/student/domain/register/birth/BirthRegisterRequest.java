package mts.student.domain.register.birth;

import mts.student.domain.entity.Adress;
import mts.student.domain.entity.Person;
import mts.student.util.LocalDateAdapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

public class BirthRegisterRequest {

    private String fatherSurName;
    private String fatherGivenName;
    private String fatherPatronymicName;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate fatherDateOfBirth;
    private String fatherPassportSerial;
    private String fatherPassportNumber;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate fatherPassportDate;

    private String motherSurName;
    private String motherGivenName;
    private String motherPatronymicName;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate motherDateOfBirth;
    private String motherPassportSerial;
    private String motherPassportNumber;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate motherPassportDate;

    private String birthCertNumber;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private String birthCertDate;

    @Override
    public String toString() {
        return "BirthRegisterRequest{" +
                "fatherSurName='" + fatherSurName + '\'' +
                ", fatherGivenName='" + fatherGivenName + '\'' +
                ", fatherPatronymicName='" + fatherPatronymicName + '\'' +
                ", fatherDateOfBirth=" + fatherDateOfBirth +
                ", fatherPassportSerial='" + fatherPassportSerial + '\'' +
                ", fatherPassportNumber='" + fatherPassportNumber + '\'' +
                ", fatherPassportDate=" + fatherPassportDate +
                ", motherSurName='" + motherSurName + '\'' +
                ", motherGivenName='" + motherGivenName + '\'' +
                ", motherPatronymicName='" + motherPatronymicName + '\'' +
                ", motherDateOfBirth=" + motherDateOfBirth +
                ", motherPassportSerial='" + motherPassportSerial + '\'' +
                ", motherPassportNumber='" + motherPassportNumber + '\'' +
                ", motherPassportDate=" + motherPassportDate +
                ", birthCertNumber='" + birthCertNumber + '\'' +
                ", birthCertDate='" + birthCertDate + '\'' +
                '}';
    }

    public String getFatherSurName() {
        return fatherSurName;
    }

    public void setFatherSurName(String fatherSurName) {
        this.fatherSurName = fatherSurName;
    }

    public String getFatherGivenName() {
        return fatherGivenName;
    }

    public void setFatherGivenName(String fatherGivenName) {
        this.fatherGivenName = fatherGivenName;
    }

    public String getFatherPatronymicName() {
        return fatherPatronymicName;
    }

    public void setFatherPatronymicName(String fatherPatronymicName) {
        this.fatherPatronymicName = fatherPatronymicName;
    }

    public LocalDate getFatherDateOfBirth() {
        return fatherDateOfBirth;
    }

    public void setFatherDateOfBirth(LocalDate fatherDateOfBirth) {
        this.fatherDateOfBirth = fatherDateOfBirth;
    }

    public String getFatherPassportSerial() {
        return fatherPassportSerial;
    }

    public void setFatherPassportSerial(String fatherPassportSerial) {
        this.fatherPassportSerial = fatherPassportSerial;
    }

    public String getFatherPassportNumber() {
        return fatherPassportNumber;
    }

    public void setFatherPassportNumber(String fatherPassportNumber) {
        this.fatherPassportNumber = fatherPassportNumber;
    }

    public LocalDate getFatherPassportDate() {
        return fatherPassportDate;
    }

    public void setFatherPassportDate(LocalDate fatherPassportDate) {
        this.fatherPassportDate = fatherPassportDate;
    }

    public String getMotherSurName() {
        return motherSurName;
    }

    public void setMotherSurName(String motherSurName) {
        this.motherSurName = motherSurName;
    }

    public String getMotherGivenName() {
        return motherGivenName;
    }

    public void setMotherGivenName(String motherGivenName) {
        this.motherGivenName = motherGivenName;
    }

    public String getMotherPatronymicName() {
        return motherPatronymicName;
    }

    public void setMotherPatronymicName(String motherPatronymicName) {
        this.motherPatronymicName = motherPatronymicName;
    }

    public LocalDate getMotherDateOfBirth() {
        return motherDateOfBirth;
    }

    public void setMotherDateOfBirth(LocalDate motherDateOfBirth) {
        this.motherDateOfBirth = motherDateOfBirth;
    }

    public String getMotherPassportSerial() {
        return motherPassportSerial;
    }

    public void setMotherPassportSerial(String motherPassportSerial) {
        this.motherPassportSerial = motherPassportSerial;
    }

    public String getMotherPassportNumber() {
        return motherPassportNumber;
    }

    public void setMotherPassportNumber(String motherPassportNumber) {
        this.motherPassportNumber = motherPassportNumber;
    }

    public LocalDate getMotherPassportDate() {
        return motherPassportDate;
    }

    public void setMotherPassportDate(LocalDate motherPassportDate) {
        this.motherPassportDate = motherPassportDate;
    }

    public String getBirthCertNumber() {
        return birthCertNumber;
    }

    public void setBirthCertNumber(String birthCertNumber) {
        this.birthCertNumber = birthCertNumber;
    }

    public String getBirthCertDate() {
        return birthCertDate;
    }

    public void setBirthCertDate(String birthCertDate) {
        this.birthCertDate = birthCertDate;
    }
}
