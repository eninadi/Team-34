package com.datorium.Datorium.API.DTOs;


public class Message {
    private String content;
    private String sender;

    // Constructors
    public Message() {}

    public Message(String content, String sender) {
        this.content = content;
        this.sender = sender;
    }

    // Getters and Setters
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                ", sender='" + sender + '\'' +
                '}';
    }
}
