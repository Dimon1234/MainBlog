package com.devlifeblog.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.diomonjeelife.Blog.domain.ArticleRepository;
import ru.diomonjeelife.Blog.model.Article;
import ru.diomonjeelife.Blog.model.Blog;

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
