package com.univer.controller;

import com.univer.entity.User;
import com.univer.service.HighScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    private HighScoreService highScoreService;

    @Autowired
    public IndexController(HighScoreService highScoreService) {
        this.highScoreService = highScoreService;
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/highscores")
    public ModelAndView highscores() {
        ModelAndView modelAndView = new ModelAndView("highscores");
        modelAndView.addObject("highscores", highScoreService.getRank());
        return modelAndView;
    }

    @RequestMapping("/play")
    public String play() {
        return "play";
    }

    @RequestMapping(value = "/signup")
    public ModelAndView signup() {
        ModelAndView modelAndView = new ModelAndView("signup");
        modelAndView.addObject("signupForm", new User());

        return modelAndView;
    }

    @RequestMapping(value = "/login")
    public ModelAndView signin() {
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }
}
