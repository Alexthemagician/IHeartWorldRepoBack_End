package com.myfirstapp.i_heart_world.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "messages")
@Getter
@Setter
public class Messages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "message_text")
    private String messageText;

    @Column(name = "date_created")
    private Date dateCreated;

    @Column(name = "last_updated")
    private Date lastUpdated;
}
