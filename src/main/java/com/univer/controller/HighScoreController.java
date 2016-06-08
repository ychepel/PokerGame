package com.univer.controller;

import com.univer.entity.HighScoreRecord;
import com.univer.service.HighScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HighScoreController {

    private HighScoreService highScoreService;

    @Autowired
    public HighScoreController(HighScoreService highScoreService) {
        this.highScoreService = highScoreService;
    }

    @RequestMapping("/highscore-table")
    public List<HighScoreRecord> highscores() {
        return highScoreService.getRank();
    }
}
