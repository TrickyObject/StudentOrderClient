package mts.student;

import mts.student.dao.StudentOrderDaoImpl;
import mts.student.domain.entity.*;
import mts.student.exception.DaoException;

import java.time.LocalDate;

public class MakeStudentOrder {

    public static void main(String[] args) {

        StudentOrderDaoImpl dao = new StudentOrderDaoImpl();

        try {
            dao.saveStudentOrder(buildStudentOrder(1));
        } catch (DaoException e) {
            e.printStackTrace();
        }
    }

    public static StudentOrder buildStudentOrder(long id) {

        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);
        so.setMarriageCertId("1");
        so.setMarriageDate(LocalDate.of(2018, 4,10));
        RegisterOffice ro = new RegisterOffice(1L, "010010000000", "ЗАГС 1 района 1 города");
        so.setMarriageOffice(ro);

        Street street = new Street(6L, "Кирова");

        Adress adress = new Adress("195000", street, "10", "", "141");

        // Муж
        Adult husband = new Adult(
                "Павел", "Васильев", "Николаевич",
                LocalDate.of(1995, 3, 18));
        husband.setPassportSerial("1234");
        husband.setPassportNum("123456");
        husband.setPassportDate(LocalDate.of(2015, 04, 11));
        PassportOffice po1 = new PassportOffice(1L, "010010000000",
                "Паспортный стол района 1 города");
        husband.setPassportOffice(po1);
        husband.setStudentId(""+(100000+id));
        husband.setAdress(adress);
        husband.setUni(new University(1L, "КемГУ"));
//        husband.setStudentId("HH12345");

        // Жена
        Adult wife = new Adult(
                "Ирина", "Васильева", "Петровна",
                LocalDate.of(1997, 4, 5));
        wife.setPassportSerial("4321");
        wife.setPassportNum("654321");
        wife.setPassportDate(LocalDate.of(2017, 4, 5));
        PassportOffice po2 = new PassportOffice(1L, "010010000000",
                "Паспортный стол района 1 города");
        wife.setPassportOffice(po2);
        wife.setStudentId(""+(200000+id));
        wife.setAdress(adress);
        wife.setUni(new University(1L, "КемГУ"));
//        wife.setStudentId("WW12345");

        // ребёнок
        Child child1 = new Child(
                "Васильев", "Александр", "Павлович",
                LocalDate.of(2015,1,11));
        child1.setCertNum("456123");
        child1.setIssueDate(LocalDate.of(2015, 1, 21));
        RegisterOffice ro2 = new RegisterOffice(1L, "010010000000",
                "Паспортный стол района 1 города");
        child1.setIssueDep(ro2);
        child1.setAdress(adress);
        // ребёнок
        Child child2 = new Child(
                "Васильева", "Ирина", "Павловна",
                LocalDate.of(2018,10,11));
        child2.setCertNum("987654");
        child2.setIssueDate(LocalDate.of(2018, 11, 21));
        RegisterOffice ro3 = new RegisterOffice(1L, "010010000000",
                "Паспортный стол района 1 города");
        child2.setIssueDep(ro3);
        child2.setAdress(adress);

        so.setHusband(husband);
        so.setWife(wife);
        so.addChild(child1);
        so.addChild(child2);

        return so;
    }
}
