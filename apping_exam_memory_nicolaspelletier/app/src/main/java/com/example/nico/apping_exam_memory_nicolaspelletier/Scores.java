package com.example.nico.apping_exam_memory_nicolaspelletier;

import java.util.Date;

/**
 * Created by nico on 19/12/2017.
 */

public class Scores {

    public Scores(Date date, Boolean win, Integer score)
    {
        this.date = date;
        this.didWin = win;
        this.score = score;
    }

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getDidWin() {
        return didWin;
    }

    public void setDidWin(Boolean didWin) {
        this.didWin = didWin;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    private Boolean didWin;
    private Integer score;

}
