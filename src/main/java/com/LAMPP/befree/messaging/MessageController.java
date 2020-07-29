package com.LAMPP.befree.messaging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/message")
public class MessageController {

    private MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }


    @GetMapping
    public ResponseEntity<List<ShowMessageDTO>> getAllMessages(){
        return new ResponseEntity<>(messageService.getAllMessages(), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<SendMessageDTO> sendMessage(@Valid @RequestBody SendMessageDTO messageDto){

        messageService.sendMessage(messageDto);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }


}
