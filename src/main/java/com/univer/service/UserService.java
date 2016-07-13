package com.univer.service;

import com.univer.entity.User;
import com.univer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    public void save(User user) {
        user.setPassword(passwordEncoder.encode(user.getInputPassword()));
        userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.getAllUsers();
    }
}
