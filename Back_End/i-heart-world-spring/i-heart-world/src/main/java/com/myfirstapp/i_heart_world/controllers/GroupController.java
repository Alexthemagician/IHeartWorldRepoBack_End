package com.myfirstapp.i_heart_world.controllers;

import com.myfirstapp.i_heart_world.dao.GroupPostRepository;
import com.myfirstapp.i_heart_world.dao.GroupRepository;
import com.myfirstapp.i_heart_world.entity.Group;
import com.myfirstapp.i_heart_world.entity.GroupPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/groups")
@CrossOrigin("http://localhost:4200")
public class GroupController {

    @Autowired
    private GroupRepository groupRepository;

    private Group group;


    @PostMapping("/api/groups")
    public Group createGroup(@RequestBody Group group) {
        this.group = group;
        return groupRepository.save(group);
    }
}
