package com.datorium.Datorium.API.Controllers;

import com.datorium.Datorium.API.DTOs.Message;
import com.datorium.Datorium.API.Services.MessageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping
    public Message createMessage(@RequestBody Message messageRequest) {
        // Use the service to create a message
        return messageService.createMessage(messageRequest.getContent(), messageRequest.getSender());
    }

    @GetMapping("/process")
    public String processMessage(@RequestParam String content, @RequestParam String sender) {
        // Create a message using the service
        Message message = messageService.createMessage(content, sender);
        // Process the message and return the result
        return messageService.processMessage(message);
    }
}
