package com.LAMPP.befree.messaging;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MessageRepositoryAccess {

    private List<Message> messageList = new ArrayList<>();



    public List<Message> findAll() {
        return messageList;
    }

    public void save(Message message){
        messageList.add(message);
    }
}
