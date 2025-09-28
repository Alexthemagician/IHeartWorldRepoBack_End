package com.myfirstapp.i_heart_world.controllers;

import com.myfirstapp.i_heart_world.dao.MessagesRepository;
import com.myfirstapp.i_heart_world.entity.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/messages")
@CrossOrigin
public class MessagesController {

    @Autowired
    private MessagesRepository messagesRepository;

    private Messages messages;

    @GetMapping
    public java.util.List<Messages> getAllMessages() {
        return messagesRepository.findAll();
    }

    @GetMapping("/by-id")
    public Messages getMessageById(Long id) {
        return messagesRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Messages addMessage(@RequestBody Messages messages, @RequestParam String userName) {
        messages.setUserName(userName);
        this.messages = messages;
        return messagesRepository.save(messages);
    }

    @DeleteMapping
    public void deleteMessage(@RequestParam Long id) {
        messagesRepository.deleteById(id);
    }
}
