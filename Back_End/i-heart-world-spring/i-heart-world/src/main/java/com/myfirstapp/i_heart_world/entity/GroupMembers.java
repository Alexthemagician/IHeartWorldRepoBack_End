package com.myfirstapp.i_heart_world.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "group_members")
@Getter
@Setter
public class GroupMembers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "group_id")
    private Long groupId;

    @Column(name = "member_name")
    private String memberName;
}
