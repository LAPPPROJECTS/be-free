package com.LAMPP.befree.review;


import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.io.Serializable;
import java.time.*;

@JsonAutoDetect
public class Review implements Serializable {

    private int idFrom;
    private int idFor;
    private String content;
    private Enum rating;
    private LocalDateTime localDateTime;
    private LocalDate date;
    private LocalTime time;

    public Review() {
    }

    public Review(int idFrom, int idFor, String content, Enum rating, LocalDateTime localDateTime) {
        this.idFrom = idFrom;
        this.idFor = idFor;
        this.content = content;
        this.rating = rating;
        this.localDateTime = localDateTime;

    }

    public int getIdFrom() {
        return idFrom;
    }

    public int getIdFor() {
        return idFor;
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