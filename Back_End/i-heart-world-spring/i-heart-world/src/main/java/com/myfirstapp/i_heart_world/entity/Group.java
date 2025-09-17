package com.myfirstapp.i_heart_world.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "`group`")
@Getter
@Setter
public class Group {

    @Id
    @GeneratedValue
    @Column(name = "group_id")
    private Long groupId;

    @Column(name = "group_name")
    private String groupName;

    @Column(name = "group_description")
    private String groupDescription;

    @Column(name = "group_img_url")
    private String groupImgUrl;

    @Column(name = "group_admin")
    private String groupAdmin;

    @Column(name = "date_created")
    private Date dateCreated;

    @Column(name = "members")
    private String members;




}
