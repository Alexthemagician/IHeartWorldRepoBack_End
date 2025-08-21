package com.myfirstapp.i_heart_world.dao;

import com.myfirstapp.i_heart_world.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")

public interface GroupRepository extends JpaRepository<Group, Long> {

    // Custom query methods can be added here if needed
    // For example, to find groups by admin:
    // List<Group> findByGroupAdmin(String groupAdmin);
}
