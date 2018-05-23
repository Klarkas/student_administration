package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDbUtils {
private static final String URL ="jdbc:mysql://127.0.0.1:3306/studentai";
private static final String NAME = "root";
private static final String PASSWORD = "";

    public static Connection createConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL,NAME,PASSWORD);
        } catch (SQLException e) {
            System.out.println("Prisijungti nepavyko");

        }
        return connection;
    }
}