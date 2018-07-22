package com.devlifeblog.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "blog_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String login;

    @OneToOne
    @JoinColumn(name = "blog_id")
    @JsonIgnore
    private Blog blog;

    @Column(unique = true)
    private String mail;

    private String name;

    private String surName;

    private String status; //описание рода занятий или настроение и т.п

    private String description;

    private Role role;

    private String photo;

}
