package com.LAMPP.befree.messaging;

import org.springframework.stereotype.Service;

@Service
public class MessageToDTOMapper {

    public ShowMessageDTO showMessageDTO(Message message){
        if(message == null){
            return null;
        } else {
            ShowMessageDTO showMessageDTO = new ShowMessageDTO();
            showMessageDTO.id = message.getId();
            showMessageDTO.toUser = message.getToUser();
            showMessageDTO.fromUser = message.getFromUser();
            showMessageDTO.body = message.getBody();
            return showMessageDTO;
        }
    }


}
