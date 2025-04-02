package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        Util.getConnection();
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Victor", "Tehov", (byte) 20);
        userDao.saveUser("Igor", "Tyastov", (byte) 25);
        userDao.saveUser("Alexander", "Melnikov", (byte) 31);
        userDao.saveUser("Anton", "Bessonov", (byte) 38);

        userDao.removeUserById(1);
        System.out.print(userDao.getAllUsers());
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
