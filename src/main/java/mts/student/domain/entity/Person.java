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

    public Person(String firstName, String secondName, String patronymicName, LocalDate bd) {
        this.firstName = firstName;
        this.surName = secondName;
        this.patronymicName = patronymicName;
        this.birthDay = bd;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + surName + '\'' +
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

    public String getSecondName() {
        return surName;
    }

    public void setSecondName(String secondName) {
        this.surName = secondName;
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