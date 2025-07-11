package com.myfirstapp.i_heart_world.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "app_user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "profile_img_url")
    private String profileImgUrl;

    @Column(name = "about")
    private String about;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<UserPost> userPosts;

}
