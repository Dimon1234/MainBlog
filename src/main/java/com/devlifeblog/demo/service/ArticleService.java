package com.devlifeblog.demo.service;

import com.devlifeblog.demo.domain.ArticleRepository;
import com.devlifeblog.demo.model.Article;
import com.devlifeblog.demo.model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> findAllArticlesForUser(User user) {
        return articleRepository.findAllUserArticles(user);
    }

    public List<Article> getNewsArticles() {
        return articleRepository.findAllNewsArticles();
    }


}
