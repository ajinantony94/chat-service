package com.service.chat.chat_service.Controller;

import com.service.chat.chat_service.Services.ChatService;
import com.service.chat.chat_service.Entities.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chat/api/")
public class ChatController {
    @Autowired
    private ChatService chatService;

    @GetMapping("/home")
    public String home(){
        return "hai all, this will be the home page!!!";
    }

    @PostMapping("/send")
    public Message sendMessage(@RequestBody Message message){
        return chatService.sendMessage(message);
    }
    @GetMapping("/getchat")
    public List<Message> getChat(@RequestParam String sender,@RequestParam String receiver){
        return chatService.getChat(sender,receiver);
    }

}
