package com.myfirstapp.i_heart_world.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "friends")
@Getter
@Setter
public class Friends {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_name_requested")
    private String userNameRequested;

    @Column(name = "user_name_accepted")
    private String userNameAccepted;

    @Column(name = "sent")
    private Boolean sent;

    @Column(name = "accepted")
    private Boolean accepted;
}
