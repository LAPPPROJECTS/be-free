package com.LAMPP.befree.messaging;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@Service
public class MessageService {

    private MessageRepository messageRepository;
    private MessageToDTOMapper messageToDTOMapper;

    @Autowired
    public MessageService(MessageRepository messageRepository,
                          MessageToDTOMapper messageToDTOMapper) {
        this.messageRepository = messageRepository;
        this.messageToDTOMapper = messageToDTOMapper;
    }

    public List<MessageDTO> getAllMessages() {
        List<Message> allMessages = (List<Message>) messageRepository.findAll();
        return allMessages.stream().map(message -> messageToDTOMapper.messageDTO(message)).collect(Collectors.toList());
    }

    public void sendMessage(MessageDTO messageDTO){

        Message message = new Message(messageDTO.to, messageDTO.from, messageDTO.body);
        messageRepository.save(message);

    }

}
