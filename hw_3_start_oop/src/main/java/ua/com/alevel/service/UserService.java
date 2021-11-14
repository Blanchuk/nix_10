package ua.com.alevel.service;

import ua.com.alevel.dao.UserDao;
import ua.com.alevel.entity.User;
import ua.com.alevel.exception.NotFoundException;


public class UserService {

    private final UserDao userDao = new UserDao();

    public void create(User user) {
      if (!userDao.existByEmail(user.getEmail())) {
        userDao.create(user);
        } else {
            System.out.println("user exist by email");
        }
    }

    public void update(User user) {
        try {
            userDao.update(user);
        } catch (NotFoundException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public void delete(String id) {
        try {
            userDao.delete(id);
        } catch (NotFoundException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public User findById(String id) {
        try {
            return userDao.findById(id);
        } catch (NotFoundException exception) {
            System.out.println(exception.getMessage());
        }
        return null;
    }

    public User[] findAll() {
        return userDao.findAll();
    }
}
