package mts.student.domain.entity;

import mts.student.util.LocalDateAdapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

public class Adult extends Person {

    private String passportSerial;
    private String passportNum;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate passportDate;
    private PassportOffice passportOffice;
    private University uni;
    private String studentId;
    private Adress adress;

    public Adult() {
    }

    @Override
    public String toString() {
        return "Adult{" +
                "passportSerial='" + passportSerial + '\'' +
                ", passportNum='" + passportNum + '\'' +
                ", passportDate=" + passportDate +
                ", passportOffice=" + passportOffice +
                ", uni=" + uni +
                ", studentId='" + studentId + '\'' +
                ", adress=" + adress +
                "} " + super.toString();
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Adult(String fName, String sName, String pName, LocalDate bd) {
        super(fName, sName, pName, bd);
    }

    public University getUni() {
        return uni;
    }

    public void setUni(University uni) {
        this.uni = uni;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getPassportSerial() {
        return passportSerial;
    }

    public void setPassportSerial(String passportSerial) {
        this.passportSerial = passportSerial;
    }

    public String getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(String passportNum) {
        this.passportNum = passportNum;
    }

    public LocalDate getPassportDate() {
        return passportDate;
    }

    public void setPassportDate(LocalDate passportDate) {
        this.passportDate = passportDate;
    }

    public PassportOffice getPassportOffice() {
        return passportOffice;
    }

    public void setPassportOffice(PassportOffice passportOffice) {
        this.passportOffice = passportOffice;
    }


}
