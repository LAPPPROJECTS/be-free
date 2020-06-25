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

    private long toUser;
    private long fromUser;
    private String body;

    public Message(UUID id, long toUser, long fromUser, String body) {
        this.id = id;
        this.toUser = toUser;
        this.fromUser = fromUser;
        this.body = body;
    }

    public Message() {
    }

    public UUID getId() {
        return id;
    }

    public long getToUser() {
        return toUser;
    }

    public long getFromUser() {
        return fromUser;
    }

    public String getBody() {
        return body;
    }

}



