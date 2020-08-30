package mts.student.domain.register.city;

import mts.student.domain.entity.Adress;
import mts.student.domain.entity.Person;
import mts.student.util.LocalDateAdapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

public class CityRegisterRequest {

    private String surName;
    private String firstName;
    private String patronymicName;
    // Поле, которое использует адаптер
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate dateOfBirth;
    private Long streetCode;
    private String building;
    private String extension;
    private String apartment;

    public CityRegisterRequest() {
    }

    public CityRegisterRequest(Person person) {
        surName = person.getSurName();
        firstName = person.getFirstName();
        patronymicName = person.getPatronymicName();
        dateOfBirth = person.getBirthDay();
        Adress adr = person.getAdress();
        streetCode = adr.getStreet().getStreet_code();
        building = adr.getBuilding();
        extension = adr.getExtension();
        apartment = adr.getApartment();

    }


    @Override
    public String toString() {
        return "CityRegisterRequest{" +
                "surName='" + surName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymicName='" + patronymicName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", streetCode=" + streetCode +
                ", building='" + building + '\'' +
                ", extension='" + extension + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public Long getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(Long streetCode) {
        this.streetCode = streetCode;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}
