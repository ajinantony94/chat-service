package com.service.chat.chat_service.Repositories;

import com.service.chat.chat_service.Entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatRepo extends JpaRepository<Message,Long> {
    List<Message> findBySenderAndReceiver(String sender,String receiver);
}
