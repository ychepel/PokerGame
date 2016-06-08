package com.univer.service;

import com.univer.entity.HighScoreRecord;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class HighScoreService {

    public List<HighScoreRecord> getRank() {
        List<HighScoreRecord> scores = new LinkedList<HighScoreRecord>();
        scores.add(new HighScoreRecord(0, "Ivan Petrov", getRandomScore(), new GregorianCalendar(2016, 5, 30)));
        scores.add(new HighScoreRecord(0, "Sergey Kozlov", getRandomScore(), new GregorianCalendar(2016, 4, 29)));
        scores.add(new HighScoreRecord(0, "Arkadiy Raykin", getRandomScore(), new GregorianCalendar(2016, 4, 10)));
        scores.add(new HighScoreRecord(0, "Anatoliy Kashpirovsky", getRandomScore(), new GregorianCalendar(2016, 5, 15)));
        scores.add(new HighScoreRecord(0, "Olha Pupkina", getRandomScore(), new GregorianCalendar(2016, 4, 15)));

        sortScores(scores);
        addRank(scores);

        return scores;
    }

    private int getRandomScore() {
        return (int) (Math.random()*100000);
    }

    private void sortScores(List<HighScoreRecord> scores) {
        Collections.sort(scores, new Comparator<HighScoreRecord>() {
            @Override
            public int compare(HighScoreRecord r1, HighScoreRecord r2) {
                return r2.getScore() - r1.getScore();
            }
        });
    }

    private void addRank(List<HighScoreRecord> scores) {
        int i = 1;
        for(HighScoreRecord record : scores) {
            record.setRank(i++);
        }
    }
}
