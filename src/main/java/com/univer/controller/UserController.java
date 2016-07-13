package com.univer.controller;

import com.univer.entity.HighScoreRecord;
import com.univer.entity.User;
import com.univer.service.HighScoreService;
import com.univer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user-table")
    public List<User> showUsers() {
        return userService.findAll();
    }
}
