package com.myfirstapp.i_heart_world.controllers;

import com.myfirstapp.i_heart_world.dao.FriendsRepository;
import com.myfirstapp.i_heart_world.entity.Friends;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/friends")
@CrossOrigin
public class FriendsController {

    @Autowired
    private FriendsRepository friendsRepository;

    private Friends friends;

    @GetMapping
    public java.util.List<Friends> getAllFriends() {
        return friendsRepository.findAll();
    }

    @GetMapping("/by-id")
    public Friends getFriendById(Long id) {
        return friendsRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Friends addFriend(@RequestBody Friends friends) {
        this.friends = friends;
        return friendsRepository.save(friends);
    }

    @DeleteMapping
    public void deleteFriend(@RequestParam Long id) {
        friendsRepository.deleteById(id);
    }
}
