package mts.student;

import mts.student.checkers.All;
import mts.student.checkers.CityRegisterChecker;
import mts.student.dao.StudentOrderDaoImpl;
import mts.student.domain.entity.StudentOrder;
import mts.student.exception.DaoException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Временный стартер
 *
 * забирает данные из БД: студенческие заявки
 * передаёт их по одной в ALL для проверки
 *
 */

public class Firestarter {

    private static final Logger logger =
            LoggerFactory.getLogger(Firestarter.class);

    private All all;

    public Firestarter() {
        all = new All();
    }

    public static void main(String[] args) {

        logger.info("Main");

        Firestarter firestarter = new Firestarter();

        firestarter.checkAll();

    }

    // получение всех заявок и их проверка
    public void checkAll() {

        try {
            List <StudentOrder> soList = readStudentOrders();

            for(StudentOrder so : soList) {
                logger.info("SO" + so.toString());

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
