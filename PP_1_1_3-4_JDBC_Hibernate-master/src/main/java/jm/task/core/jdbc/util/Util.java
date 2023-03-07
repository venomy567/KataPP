package jm.task.core.jdbc.util;

import java.sql.*;

public final class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/zadanie1";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "root";
    private static Connection connection = null;
    private static Util util = null;

    private Util() {
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static Util creatUtil(){
        if (util == null) util = new Util();
        return util;
    }
    public static Connection getConnection() {
        return connection;
    }
}
