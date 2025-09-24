package com.myfirstapp.i_heart_world.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "group_post")
@Getter
@Setter
public class GroupPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long groupPostId;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "post_category")
    private String postCategory;

    @Column(name = "post_title")
    private String postTitle;

    @Column(name = "post_text")
    private String postText;

    @Column(name = "post_img_url")
    private String postImgUrl;

    @Column(name = "post_video_url")
    private String postVideoUrl;

    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "last_updated")
    @UpdateTimestamp
    private Date lastUpdated;


    @Column(name = "group_id")
    private Long groupId;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private User user;
}
