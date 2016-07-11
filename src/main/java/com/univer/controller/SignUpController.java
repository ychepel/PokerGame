package com.univer.controller;

import com.univer.entity.User;
import com.univer.model.RegistrationModel;
import com.univer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SignUpController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public void register(@RequestBody RegistrationModel model) {
        User user = new User();
        user.setEmail(model.getEmail());
        user.setName(model.getName());
        user.setInputPassword(model.getPassword());
        userService.save(user);
    }
}
