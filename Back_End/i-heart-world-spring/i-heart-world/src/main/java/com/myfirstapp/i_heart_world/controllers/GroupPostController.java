package com.myfirstapp.i_heart_world.controllers;

import com.myfirstapp.i_heart_world.dao.GroupPostRepository;
import com.myfirstapp.i_heart_world.dao.UserPostRepository;
import com.myfirstapp.i_heart_world.entity.GroupPost;
import com.myfirstapp.i_heart_world.entity.UserPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/groupPosts")
@CrossOrigin("http://localhost:4200")
public class GroupPostController {

    @Autowired
    private GroupPostRepository groupPostRepository;
    private GroupPost groupPost;


    @PostMapping("/api/groupPosts")
    public GroupPost createGroupPost(@RequestBody GroupPost groupPost) {
        this.groupPost = groupPost;
        return groupPostRepository.save(groupPost);
    }

    @GetMapping("/api/userPosts/postId")
    public Long getPostId() {
        System.out.println(groupPost.getGroupPostId());
        return groupPost.getGroupPostId();

    }

    @GetMapping("/by-id")
    public ResponseEntity<GroupPost> getGroupPostById(@RequestParam long id) {
        Optional<GroupPost> groupPost = groupPostRepository.findById(id);
        return groupPost.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }


}
