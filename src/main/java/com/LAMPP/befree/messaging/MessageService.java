package com.LAMPP.befree.messaging;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public List<ShowMessageDTO> getAllMessages() {
        List<Message> allMessages = messageRepository.findAll();
        return allMessages.stream().map(message -> messageToDTOMapper.showMessageDTO(message)).collect(Collectors.toList());
    }

    public Message sendMessage(SendMessageDTO sendMessageDTO){

        Message message = new Message(sendMessageDTO.toUser, sendMessageDTO.fromUser, sendMessageDTO.body);
        messageRepository.save(message);
        return message;
    }

}
