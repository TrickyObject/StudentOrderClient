package mts.student.domain.register.student;

import mts.student.domain.entity.Adress;
import mts.student.domain.entity.Person;
import mts.student.util.LocalDateAdapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

public class StudentRegisterRequest {

    private String surName;
    private String givenName;
    private String patronymicName;
    // Поле, которое использует адаптер
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate dateOfBirth;
    private Long streetCode;
    private String building;
    private String extension;
    private String apartment;

    public StudentRegisterRequest() {
    }

    public StudentRegisterRequest(Person person) {
        surName = person.getSecondName();
        givenName = person.getFirstName();
        patronymicName = person.getPatronymicName();
        dateOfBirth = person.getBirthDay();
        Adress adr = person.getAdress();
        streetCode = adr.getStreet().getStreet_code();
        building = adr.getBuilding();
        extension = adr.getExtension();
        apartment = adr.getApartment();

    }

// TODO: refactor
    public String toJSON() {
        return "{" +
                "surName:" + surName + '\n' +
                ", givenName:" + givenName + '\n' +
                ", patronymicName:" + patronymicName + '\n' +
                ", dateOfBirth:" + dateOfBirth + '\n' +
                ", streetCode:" + streetCode + '\n' +
                ", building:" + building + '\n' +
                ", extension:" + extension + '\n' +
                ", apartment:" + apartment + '\n' +
                '}';
    }

}
