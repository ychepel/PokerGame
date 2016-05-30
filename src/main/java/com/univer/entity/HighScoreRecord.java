package com.univer.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Calendar;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class HighScoreRecord {

    private int rank;
    private String name;
    private int score;
    private Calendar date;

}
