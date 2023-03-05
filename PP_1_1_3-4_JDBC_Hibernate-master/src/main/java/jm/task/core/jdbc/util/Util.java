package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private final String URL = "jdbc:mysql://localhost:3306/zadanie1";
    private final String login = "root";
    private final String password = "root";
    private Connection connection = null;

    public Util() {
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, login, password);

        } catch (SQLException e) {
            System.out.println(e);
        }

    }
    public Connection getConnection() {
        return connection;
    }
}
