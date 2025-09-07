package com.myfirstapp.i_heart_world.controllers;

import com.myfirstapp.i_heart_world.dao.GroupPostRepository;
import com.myfirstapp.i_heart_world.dao.UserPostRepository;
import com.myfirstapp.i_heart_world.entity.GroupPost;
import com.myfirstapp.i_heart_world.entity.UserPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/groupPosts")
@CrossOrigin
public class GroupPostController {

    @Autowired
    private GroupPostRepository groupPostRepository;
    private GroupPost groupPost;

    @GetMapping
    public java.util.List<GroupPost> getAllGroupPosts() {
        return groupPostRepository.findAll();
    }
    @PostMapping
    public GroupPost createGroupPost(@RequestBody GroupPost groupPost) {
        this.groupPost = groupPost;
        return groupPostRepository.save(groupPost);
    }
}
