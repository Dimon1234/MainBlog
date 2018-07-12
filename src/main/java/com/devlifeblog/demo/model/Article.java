package com.devlifeblog.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String mainCaption; // заголовок

    private String subCaption; // подзкголовок

    @OneToMany(mappedBy = "article")
    private List<Comment> comments; // комментарии

    private Double rating;

    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
    private List<Image> images;

    @ManyToOne
    @JoinColumn(name = "blog_id")
    private Blog blog;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMainCaption() {
        return mainCaption;
    }

    public void setMainCaption(String mainCaption) {
        this.mainCaption = mainCaption;
    }

    public String getSubCaption() {
        return subCaption;
    }

    public void setSubCaption(String subCaption) {
        this.subCaption = subCaption;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }
}
