package com.LAMPP.befree.messaging;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.UUID;

@Entity
public class Message implements Serializable {

    @javax.persistence.Id
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

    public Message() {
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

    public void setId(UUID id) {
        this.id = id;
    }

    public void setTo(long to) {
        this.to = to;
    }

    public void setFrom(long from) {
        this.from = from;
    }

    public void setBody(String body) {
        this.body = body;
    }
}



