package com.service.chat.chat_service.Entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity

@Table(name = "messages")
public class Message {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String sender;
    private String receiver;
    private String content;
    private LocalDateTime timestamp;

    @PrePersist
    public void oncreate(){
        this.timestamp = LocalDateTime.now();
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
