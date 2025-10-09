package com.myfirstapp.i_heart_world.controllers;

import com.myfirstapp.i_heart_world.dao.UserRepository;
import com.myfirstapp.i_heart_world.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserRepository userRepository;
    private User user;


    @PostMapping
    public User createUser(@RequestBody User user) {
        this.user = user;
        return userRepository.save(user);
    }

    @PutMapping
    public User updateUser(@RequestBody User user) {
        this.user = user;
        return userRepository.save(user);
    }

    @GetMapping("/by-email")
    public ResponseEntity<User> getUserByEmail(@RequestParam String email) {
        Optional<User> user = userRepository.findByEmail(email);
        return user.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/by-userName")
    public ResponseEntity<User> getUserByUserName(@RequestParam String userName) {
        Optional<User> user = userRepository.findByUserName(userName);
        return user.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }


}
