package ua.com.alevel.db;

import ua.com.alevel.entity.User;
import ua.com.alevel.exception.NotFoundException;

import java.util.UUID;

public class DBUser {
    private static int count = 0;
    private User[] users;
    private static DBUser instance;

    private DBUser() {
        users = new User[16];
    }

    public static DBUser getInstance() {
        if (instance == null) {
            instance = new DBUser();
        }
        return instance;
    }

    public void create(User user) {
        if (count >= users.length) {
            User[] usersCopy = new User[users.length * 2];
            System.arraycopy(users, 0, usersCopy, 0, users.length);
            users = usersCopy;
        }
        user.setId(UUID.randomUUID().toString());
        users[count++] = user;
    }

    public void update(User user) {
        User current = findById(user.getId());
        current.setName(user.getName());
        current.setAge(user.getAge());
    }

    public void delete(String id) {
        for (int i = 0; i < count; i++) {
            if (users[i].getId().equals(id)) {
                System.arraycopy(users, i + 1, users, i, users.length - i - 1);
                count--;
                return;
            }
        }
        throw new NotFoundException("User not found for id " + id);
    }

    public User findById(String id) {
        for (int i = 0; i < count; i++) {
            if (id.equals(users[i].getId())) {
                return users[i];
            }
        }
        throw new NotFoundException("User not found for id " + id);
    }


    public User[] findAll() {
        return users;
    }

    public boolean existByEmail(String email) {
        for (int i = 0; i < count; i++) {
            if (email.equals(users[i].getEmail())) {
                return true;
            }
        }
        return false;
    }
}
