package com.univer.repository;

import com.univer.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public void save(User user) {
        //TODO
        System.out.println("Saving User to DB:" + user);
    }
}
