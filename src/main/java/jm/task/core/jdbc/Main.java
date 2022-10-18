package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {

    public static void main(String[] args) {
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        userDaoJDBC.createUsersTable();
        userDaoJDBC.saveUser("Роман", "Домбуев", (byte) 28);
        userDaoJDBC.saveUser("Артём", "Михайлов", (byte) 27);
        userDaoJDBC.saveUser("Артур", "Кубанов", (byte) 25);
        userDaoJDBC.saveUser("Виктор", "Алейников", (byte) 24);
        System.out.println(userDaoJDBC.getAllUsers());
        userDaoJDBC.cleanUsersTable();
        userDaoJDBC.dropUsersTable();
    }
}









