package com.myfirstapp.i_heart_world.dto;

import com.myfirstapp.i_heart_world.entity.User;
import com.myfirstapp.i_heart_world.entity.UserPost;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class NewPost {

    private Long postId;

    private String userId;

    private String postText;

    private String postImgUrl;

    private String postVideoUrl;

    private Date dateCreated;

    private Date lastUpdated;

    private User user;


}
