package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    final static String URL = "jdbc:mysql://localhost:3306/Users";
    final static String USERNAME = "root";
    final static String PASSWORD = "root";

    static Connection connection;
    static Driver driver;

    public static Connection getConnection() {
        try {
            driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            return connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
