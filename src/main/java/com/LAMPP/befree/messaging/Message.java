package com.LAMPP.befree.messaging;


import java.io.Serializable;


public class Message implements Serializable {

    private long to;
    private long from;
    private String body;

    public Message(long to, long from, String body) {
        this.to = to;
        this.from = from;
        this.body = body;
    }

    public long getTo() {
        return to;
    }

    public long getFrom() {
        return from;
    }

    public String getBody() {
        return body;
    }
}



