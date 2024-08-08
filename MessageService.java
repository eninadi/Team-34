package com.datorium.Datorium.API.Services;

import com.datorium.Datorium.API.DTOs.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public Message createMessage(String content, String sender) {
        return new Message(content, sender);
    }

    public String processMessage(Message message) {
        // Here you can add logic to process the message, for example, format it
        return "Processed message from " + message.getSender() + ": " + message.getContent();
    }
}
