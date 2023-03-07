package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService user = new UserServiceImpl();

        user.createUsersTable();
        user.saveUser("Chelovek", "Chelovechiche", (byte)128);
        user.saveUser("Pupok", "Mitii", (byte)5);
        user.saveUser("Dom", "Kriwa", (byte)10);
        user.saveUser("Luda", "Popchanks", (byte)11);

        System.out.println(user.getAllUsers());

    }
}
