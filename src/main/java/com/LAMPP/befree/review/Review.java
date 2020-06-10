package com.LAMPP.befree.review;

import java.io.Serializable;
import java.util.Date;

public class Review implements Serializable {

    private String content;
    private Date datePost;
    private float rating;
    private long to;
    private long from;
    private String body;

    public Review(float rating, long to, String body) {
        this.content = content;
        this.datePost = datePost;
        this.rating = rating;
        this.to = to;
        this.from = from;
        this.body = body;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDatePost() {
        return datePost;
    }

    public void setDatePost(Date datePost) {
        this.datePost = datePost;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public long getTo() {
        return to;
    }

    public void setTo(long to) {
        this.to = to;
    }

    public long getFrom() {
        return from;
    }

    public void setFrom(long from) {
        this.from = from;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

