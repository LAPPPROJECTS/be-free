package com.LAMPP.befree.messaging;


import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.UUID;


public class Message implements Serializable {

    @Id
    private UUID id;
    private long to;
    private long from;
    private String body;

    public Message(UUID id, long to, long from, String body) {
        this.id = id;
        this.to = to;
        this.from = from;
        this.body = body;
    }

    public UUID getId() {
        return id;
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



