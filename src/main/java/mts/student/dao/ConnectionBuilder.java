package mts.student.dao;

import mts.student.config.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBuilder {

    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/student",
                "postgres",
                "root"

                //инициализация
//                Config.getProp(Config.DB_URL),
//                Config.getProp(Config.DB_LOGIN),
//                Config.getProp(Config.DB_PWD)
        );

        return connection;
    }
}
