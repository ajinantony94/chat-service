package com.service.chat.chat_service.Services;

import com.service.chat.chat_service.Entities.Role;
import com.service.chat.chat_service.Entities.User;
import com.service.chat.chat_service.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepo userRepo;

    public User register(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.ADMIN);
        return userRepo.save(user);
    }

    public Optional<User> findByUsername(String username){
        return userRepo.save(username);
    }

}
