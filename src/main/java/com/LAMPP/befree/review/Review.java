package com.LAMPP.befree.review;


import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.io.Serializable;
import java.time.*;

@JsonAutoDetect
public class Review implements Serializable {

    private String content;
    private int rating;
    private LocalDateTime localDateTime;
    private LocalDate date;
    private LocalTime time;

    public Review(String content, int rating, Object localDateTime) {
    }

    public Review(String content, Enum enume, LocalDateTime localDateTime) {
        this.content = content;
        this.localDateTime = localDateTime;

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

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public int getRating() {
        return rating;
    }

}