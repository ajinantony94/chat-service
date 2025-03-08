package com.service.chat.chat_service.Controller;

import com.service.chat.chat_service.Entities.User;
import com.service.chat.chat_service.Services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class AuthController {
    @Autowired
    private AuthService authService;
    @PostMapping("/register")
    public User register(@RequestBody User user){
        return authService.register(user);
    }
    @GetMapping("/finduser")
    public Optional<User> findByUsername(@RequestParam String username){
        return authService.findByUsername(username);
    }
}
