package com.LAMPP.befree.messaging;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@Service
public class MessageService {

    MessageRepository messageRepository;
    MessageToDTOMapper messageToDTOMapper;

    @Autowired
    public MessageService(MessageRepository messageRepository, MessageToDTOMapper messageToDTOMapper) {
        this.messageRepository = messageRepository;
        this.messageToDTOMapper = messageToDTOMapper;
    }


}
