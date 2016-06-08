package com.univer.controller;

import com.univer.model.RegistrationModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SignUpController {

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public void register(@RequestBody RegistrationModel model) {
        System.out.println(model.getName() + " " + model.getEmail());
    }
}
