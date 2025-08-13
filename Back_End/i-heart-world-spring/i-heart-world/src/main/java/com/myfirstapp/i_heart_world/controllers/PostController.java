package com.myfirstapp.i_heart_world.controllers;

import com.myfirstapp.i_heart_world.dao.UserPostRepository;
import com.myfirstapp.i_heart_world.entity.UserPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/userPosts")
@CrossOrigin("http://localhost:4200")
public class PostController {

    @Autowired
    private UserPostRepository userPostRepository;
    private UserPost userPost;

    @PostMapping("/api/userPosts")
    public UserPost createPost(@RequestBody UserPost userPost) {
        this.userPost = userPost;
        return userPostRepository.save(userPost);
    }

}
