package com.LAMPP.befree.messaging;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

@Entity
public class Message {

    @javax.persistence.Id
    @Id
    private UUID id;

    @NotNull
    private UUID toProfile;

    @NotNull
    private UUID fromProfile;

    @NotBlank(message = "Don't forget to write your message")
    @Size(max = 5000, message = "Message too long. Try to be brief!")
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



