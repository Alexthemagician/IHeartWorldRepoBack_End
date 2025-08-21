package com.myfirstapp.i_heart_world.dao;

import com.myfirstapp.i_heart_world.entity.GroupPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface GroupPostRepository extends JpaRepository<GroupPost, Long> {
    // Additional query methods can be defined here if needed
}
