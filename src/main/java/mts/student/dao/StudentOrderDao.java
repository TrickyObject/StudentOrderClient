package mts.student.dao;


import mts.student.domain.StudentOrder;
import mts.student.exception.DaoException;

import java.util.List;

public interface StudentOrderDao {

    Long saveStudentOrder(StudentOrder so) throws DaoException;

    List<StudentOrder> getStudentOrders() throws DaoException;
}
