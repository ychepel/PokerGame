package com.univer.repository;

import com.univer.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private List<User> users;


    public UserRepository() {
        users = new ArrayList<User>();
        putFakeUsers();
    }

    private void putFakeUsers() {
        User user1 = new User("pasw1", "pasw1", "a@a.a", "Ivan Petrov");
        users.add(user1);
        User user2 = new User("pasw2", "pasw2", "b@b.b", "Sergey Kozlov");
        users.add(user2);
        User user3 = new User("pasw3", "pasw3", "c@c.c", "Olha Pupkina");
        users.add(user3);
    }

    public void save(User user) {
        users.add(user);
    }

    public List<User> getAllUsers() {
        return users;
    }
}
