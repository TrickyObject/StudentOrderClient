package mts.student.domain.register.birth;

import mts.student.domain.entity.BirthCertificate;
import mts.student.util.LocalDateAdapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

public class BirthRegisterRequest {

    private String fatherFirstName;
    private String fatherSurName;
    private String fatherPatronymicName;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate fatherDateOfBirth;
    private String fatherPassportSerial;
    private String fatherPassportNumber;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate fatherPassportDate;

    private String motherFirstName;
    private String motherSurName;
    private String motherPatronymicName;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate motherDateOfBirth;
    private String motherPassportSerial;
    private String motherPassportNumber;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate motherPassportDate;

    private String childFirstName;
    private String childSurName;
    private String childPatronymicName;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate childDateOfBirth;

    private String birthCertNumber;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate birthCertDate;

    public BirthRegisterRequest() {
    }

    public BirthRegisterRequest(BirthCertificate bc) {
        this.fatherFirstName = bc.getFatherFirstName();
        this.fatherSurName = bc.getFatherSurName();
        this.fatherPatronymicName = bc.getFatherPatronymicName();
        this.fatherDateOfBirth = bc.getFatherDateOfBirth();
        this.fatherPassportSerial = bc.getFatherPassportSerial();
        this.fatherPassportNumber = bc.getFatherPassportNumber();
        this.fatherPassportDate = bc.getFatherPassportDate();

        this.motherFirstName = bc.getMotherFirstName();
        this.motherSurName = bc.getMotherSurName();
        this.motherPatronymicName = bc.getMotherPatronymicName();
        this.motherDateOfBirth = bc.getMotherDateOfBirth();
        this.motherPassportSerial = bc.getMotherPassportSerial();
        this.motherPassportNumber = bc.getMotherPassportNumber();
        this.motherPassportDate = bc.getMotherPassportDate();

        this.childFirstName = bc.getChildFirstName();
        this.childSurName = bc.getChildSurName();
        this.childPatronymicName = bc.getChildPatronymicName();
        this.childDateOfBirth = bc.getChildDateOfBirth();
        this.birthCertNumber = bc.getBirthCertNumber();
        this.birthCertDate = bc.getBirthCertDate();
    }

    @Override
    public String toString() {
        return "BirthRegisterRequest{" +
                "fatherFirstName='" + fatherFirstName + '\'' +
                ", fatherSurName='" + fatherSurName + '\'' +
                ", fatherPatronymicName='" + fatherPatronymicName + '\'' +
                ", fatherDateOfBirth=" + fatherDateOfBirth +
                ", fatherPassportSerial='" + fatherPassportSerial + '\'' +
                ", fatherPassportNumber='" + fatherPassportNumber + '\'' +
                ", fatherPassportDate=" + fatherPassportDate +
                ", motherFirstName='" + motherFirstName + '\'' +
                ", motherSurName='" + motherSurName + '\'' +
                ", motherPatronymicName='" + motherPatronymicName + '\'' +
                ", motherDateOfBirth=" + motherDateOfBirth +
                ", motherPassportSerial='" + motherPassportSerial + '\'' +
                ", motherPassportNumber='" + motherPassportNumber + '\'' +
                ", motherPassportDate=" + motherPassportDate +
                ", childFirstName='" + childFirstName + '\'' +
                ", childSurName='" + childSurName + '\'' +
                ", childPatronymicName='" + childPatronymicName + '\'' +
                ", childDateOfBirth=" + childDateOfBirth +
                ", birthCertNumber='" + birthCertNumber + '\'' +
                ", birthCertDate=" + birthCertDate +
                '}';
    }

    public String getFatherFirstName() {
        return fatherFirstName;
    }

    public void setFatherFirstName(String fatherFirstName) {
        this.fatherFirstName = fatherFirstName;
    }

    public String getFatherSurName() {
        return fatherSurName;
    }

    public void setFatherSurName(String fatherSurName) {
        this.fatherSurName = fatherSurName;
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

    public String getMotherFirstName() {
        return motherFirstName;
    }

    public void setMotherFirstName(String motherFirstName) {
        this.motherFirstName = motherFirstName;
    }

    public String getMotherSurName() {
        return motherSurName;
    }

    public void setMotherSurName(String motherSurName) {
        this.motherSurName = motherSurName;
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

    public String getChildFirstName() {
        return childFirstName;
    }

    public void setChildFirstName(String childFirstName) {
        this.childFirstName = childFirstName;
    }

    public String getChildSurName() {
        return childSurName;
    }

    public void setChildSurName(String childSurName) {
        this.childSurName = childSurName;
    }

    public String getChildPatronymicName() {
        return childPatronymicName;
    }

    public void setChildPatronymicName(String childPatronymicName) {
        this.childPatronymicName = childPatronymicName;
    }

    public LocalDate getChildDateOfBirth() {
        return childDateOfBirth;
    }

    public void setChildDateOfBirth(LocalDate childDateOfBirth) {
        this.childDateOfBirth = childDateOfBirth;
    }

    public String getBirthCertNumber() {
        return birthCertNumber;
    }

    public void setBirthCertNumber(String birthCertNumber) {
        this.birthCertNumber = birthCertNumber;
    }

    public LocalDate getBirthCertDate() {
        return birthCertDate;
    }

    public void setBirthCertDate(LocalDate birthCertDate) {
        this.birthCertDate = birthCertDate;
    }
}
