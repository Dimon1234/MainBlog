package com.devlifeblog.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class BlogUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String login;

    @OneToOne
    @JoinColumn(name = "blog_id")
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
