package com.myfirstapp.i_heart_world.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "user_post")
@Getter
@Setter
public class UserPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long postId;

    @Column(name = "user_id")
    private String userId;

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

    @ManyToOne
    @JoinColumn(name = "post_id")
    private User user;

}
