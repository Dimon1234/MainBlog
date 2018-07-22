package com.devlifeblog.demo.model;

import com.devlifeblog.demo.model.enums.ArticleType;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String mainCaption;

    private String subCaption;

    @Column(length = 2048)
    private String text;

    private ArticleType articleType;

    @OneToMany(mappedBy = "article")
    private List<Comment> comments;

    private Double rating;

    private boolean areCommentsAvailable;

    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
    private List<Image> images;

    @ManyToOne
    @JoinColumn(name = "blog_id")
    private Blog blog;

}
