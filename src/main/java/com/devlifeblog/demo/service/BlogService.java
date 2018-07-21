package com.devlifeblog.demo.service;

import com.devlifeblog.demo.domain.ArticleRepository;
import com.devlifeblog.demo.model.Article;
import com.devlifeblog.demo.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {
    private final ArticleRepository articleRepository;

    @Autowired
    public BlogService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<Article> findAllArticlesByBlog(Blog blog)
    {
        return articleRepository.findAllByBlog(blog);
    }
}
