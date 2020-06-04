package com.LAMPP.befree.messaging;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Message {

    private long to;
    private long from;
    private String body;

    public Message(long to, long from, String body) {
        this.to = to;
        this.from = from;
        this.body = body;
    }

    public Message() {
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



