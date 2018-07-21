package com.devlifeblog.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private BlogUser blogUser;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    private String text;

    private Double rating;

}
