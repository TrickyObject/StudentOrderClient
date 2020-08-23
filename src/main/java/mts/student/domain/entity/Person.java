package mts.student.domain.entity;

import java.time.LocalDate;

public abstract class Person {

    private String firstName;
    private String surName;
    private String patronymicName;
    private LocalDate birthDay;
    private Adress adress;


    public Person() {

    }

    public Person(String firstName, String surName, String patronymicName, LocalDate bd) {
        this.firstName = firstName;
        this.surName = surName;
        this.patronymicName = patronymicName;
        this.birthDay = bd;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", patronymicName='" + patronymicName + '\'' +
                ", birthDay=" + birthDay +
                ", adress=" + adress +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate bd) {
        this.birthDay = bd;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }


}
