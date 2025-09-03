package com.myfirstapp.i_heart_world.controllers;

import com.myfirstapp.i_heart_world.dao.GroupMembersRepository;
import com.myfirstapp.i_heart_world.entity.GroupMembers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/groupMembers")
@CrossOrigin("http://localhost:4200")
public class GroupMembersController {

    @Autowired
    private GroupMembersRepository groupMembersRepository;

    private GroupMembers groupMembers;

    @GetMapping
    public List<GroupMembers> getAllGroupMembers() {
        return groupMembersRepository.findAll();
    }
    @PostMapping
    public GroupMembers addGroupMembers(@RequestBody GroupMembers groupMembers) {
        this.groupMembers = groupMembers;
        return groupMembersRepository.save(groupMembers);
    }
}
