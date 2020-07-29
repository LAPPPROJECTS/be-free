package com.LAMPP.befree.messaging;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class Message {

    @javax.persistence.Id
    @Id
    private UUID id;
    private UUID toProfile;
    private UUID fromProfile;
    private String body;

    public Message(UUID toProfile, UUID fromProfile, String body) {
        this.id = UUID.randomUUID();
        this.toProfile = toProfile;
        this.fromProfile = fromProfile;
        this.body = body;
    }

    public Message() {
    }

    public UUID getId() {
        return id;
    }

    public UUID getToProfile() {
        return toProfile;
    }

    public UUID getFromProfile() {
        return fromProfile;
    }

    public String getBody() {
        return body;
    }

}



