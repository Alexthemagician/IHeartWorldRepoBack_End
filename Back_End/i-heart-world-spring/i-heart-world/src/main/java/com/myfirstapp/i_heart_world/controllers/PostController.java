package com.myfirstapp.i_heart_world.controllers;

import com.myfirstapp.i_heart_world.dao.UserPostRepository;
import com.myfirstapp.i_heart_world.entity.User;
import com.myfirstapp.i_heart_world.entity.UserPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping("/api/userPosts/postId")
    public Long getPostId() {
        System.out.println(userPost.getPostId());
        return userPost.getPostId();

    }

    @GetMapping("/by-id")
    public ResponseEntity<UserPost> getUserPostById(@RequestParam long id) {
        Optional<UserPost> userPost = userPostRepository.findById(id);
        return userPost.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
