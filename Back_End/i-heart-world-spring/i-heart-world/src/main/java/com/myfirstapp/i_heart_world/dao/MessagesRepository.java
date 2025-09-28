package com.myfirstapp.i_heart_world.dao;

import com.myfirstapp.i_heart_world.entity.Messages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "messages", path = "messages")
public interface MessagesRepository extends JpaRepository<Messages, Long> {
}
