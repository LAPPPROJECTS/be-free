package com.LAMPP.befree.messaging;

import org.springframework.stereotype.Service;

@Service
public class MessageToDTOMapper {

    public MessageDTO messageDTO(Message message){
        if(message == null){
            return null;
        } else {
            MessageDTO messageDTO = new MessageDTO();
            messageDTO.id = message.getId();
            messageDTO.toUser = message.getToUser();
            messageDTO.fromUser = message.getFromUser();
            messageDTO.body = message.getBody();
            return messageDTO;
        }
    }


}
