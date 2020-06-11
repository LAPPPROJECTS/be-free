package com.LAMPP.befree.review;


import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.io.Serializable;
import java.time.*;

@JsonAutoDetect
public class Review implements Serializable {

    private String content;
    private Enum rating;
    private LocalDateTime localDateTime;
    private LocalDate date;
    private LocalTime time;

    public Review() {
    }

    public Review(String content, Enum rating, LocalDateTime localDateTime) {
        this.content = content;
        this.rating = rating;
        this.localDateTime = localDateTime;

    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public Enum getRating() {
        return rating;
    }

}