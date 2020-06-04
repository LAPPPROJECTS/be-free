package com.LAMPP.befree.messaging;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Message {

    private long senderId;
    private long receiverId;
    private String body;

    public Message(long senderId, long receiverId, String body) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.body = body;
    }

    public Message() {
    }

    public long getSenderId() {
        return senderId;
    }

    public long getReceiverId() {
        return receiverId;
    }

    public String getBody() {
        return body;
    }
}



