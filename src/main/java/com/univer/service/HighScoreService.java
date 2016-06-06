package com.univer.service;

import com.univer.entity.HighScoreRecord;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class HighScoreService {

    public List<HighScoreRecord> getRank() {
        List<HighScoreRecord> scores = new LinkedList<HighScoreRecord>();
        scores.add(new HighScoreRecord(1, "Ivan Petrov", getRandomScore(), new GregorianCalendar(2016, 5, 30)));
        scores.add(new HighScoreRecord(2, "Sergey Kozlov", getRandomScore(), new GregorianCalendar(2016, 4, 29)));
        scores.add(new HighScoreRecord(3, "Arkadiy Raykin", getRandomScore(), new GregorianCalendar(2016, 4, 10)));
        scores.add(new HighScoreRecord(4, "Anatoliy Kashpirovsky", getRandomScore(), new GregorianCalendar(2016, 5, 15)));
        scores.add(new HighScoreRecord(5, "Olha Pupkina", getRandomScore(), new GregorianCalendar(2016, 4, 15)));

        return scores;
    }

    private int getRandomScore() {
        return (int) (Math.random()*10000);
    }
}
