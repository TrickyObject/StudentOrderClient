package mts.student;

import mts.student.checkers.All;
import mts.student.dao.StudentOrderDaoImpl;
import mts.student.domain.entity.StudentOrder;
import mts.student.exception.DaoException;

import java.util.List;

/**
 * Временный стартер
 *
 * забирает данные из БД: студенческие заявки
 * передаёт их по одной в ALL для проверки
 *
 */

public class Firestarter {

    private All all;

    public Firestarter() {
        all = new All();
    }

    public static void main(String[] args) {

        Firestarter firestarter = new Firestarter();
        firestarter.checkAll();

    }

    // получение всех заявок и их проверка
    public void checkAll() {

        try {
            List <StudentOrder> soList = readStudentOrders();
            for(StudentOrder so : soList) {
                checkOneOrder(so);
            }
        } catch (DaoException e) {
            e.printStackTrace();
        }
    }

    // получение заявок
    public List<StudentOrder> readStudentOrders() throws DaoException {
        return new StudentOrderDaoImpl().getStudentOrders();
    }

    public void checkOneOrder(StudentOrder so) {
        all.processStudentOrder(so);
    }

    /*
    // вызов проверки на регистрацию
    public void checkOneOrder(StudentOrder so) {
        AnswerCityRegister cityAnswer = checkRegistration(so);
    }

    //проверка на регистрацию
    public AnswerCityRegister checkRegistration(StudentOrder so) {
        return cityRegisterValidator.checkRegistration(so);
    }

*/

}
