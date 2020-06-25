package com.LAMPP.befree.messaging;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


@Service
public class MessageService {

    private MessageRepository messageRepository;
    private MessageToDTOMapper messageToDTOMapper;

    @Autowired
    public MessageService(MessageRepository messageRepository, MessageToDTOMapper messageToDTOMapper) {
        this.messageRepository = messageRepository;
        this.messageToDTOMapper = messageToDTOMapper;
    }

    public MessageService() {
    }

    public List<MessageDTO> getAllMessages() {
        List<Message> allMessages = messageRepository.findAll();
        return allMessages.stream().map(message -> messageToDTOMapper.messageDTO(message)).collect(Collectors.toList());
    }

    public Message sendMessage(MessageDTOWrite messageDTO){

        Message message = new Message(UUID.randomUUID(), messageDTO.fromUser, messageDTO.toUser, messageDTO.body);
        messageRepository.save(message);
        return message;
    }

}
