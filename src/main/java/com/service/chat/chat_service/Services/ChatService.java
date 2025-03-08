package com.service.chat.chat_service.Services;

import com.service.chat.chat_service.Entities.Message;
import com.service.chat.chat_service.Repositories.ChatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService {
    @Autowired
    private ChatRepo chatRepo;


    public Message sendMessage(Message message) {
        return chatRepo.save(message);
    }

    public List<Message> getChat(String sender, String receiver) {
        return chatRepo.findBySenderAndReceiver(sender,receiver);
    }
}
