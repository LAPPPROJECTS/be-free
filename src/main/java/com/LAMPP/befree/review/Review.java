package com.LAMPP.befree.review;

import net.bytebuddy.asm.Advice;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;
import java.time.*;


public class Review implements Serializable {

    private String content;
    private int rating;
    //private long to;
    //private long from;
    //private String body;
    private LocalDateTime localDateTime;
    private LocalTime time;
    private LocalDate date;

    public Review(String content, int rating, Object localDateTime) {
    }

    public Review(String content, int rating, LocalDate date, LocalTime time) {
        this.content = content;
        this.rating = rating;
        this.date = date;
        this.time = time;
    }

    private void LocalDateTime(LocalDate date, LocalTime time) {
        this.date = date;
        this.time = time;
    }

    private LocalDateTime with(LocalDate newDate, LocalTime newTime) {
        if (date == newDate && time == newTime) {
            return this.localDateTime;
        }
        return LocalDateTime.now ();
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}