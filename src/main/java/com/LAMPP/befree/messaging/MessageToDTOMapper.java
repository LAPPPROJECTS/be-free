package com.LAMPP.befree.messaging;

import org.springframework.stereotype.Service;

@Service
public class MessageToDTOMapper {

    public MessageDTO messageDTO(Message message){
        if(message == null){
            return null;
        } else {
            MessageDTO messageDTO = new MessageDTO();
            messageDTO.from = message.getFrom();
            messageDTO.to = message.getTo();
            messageDTO.body = message.getBody();
            return messageDTO;
        }
    }

}
