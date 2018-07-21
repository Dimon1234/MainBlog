package com.devlifeblog.demo.domain;

import com.devlifeblog.demo.model.Article;
import com.devlifeblog.demo.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
     List<Article> findAllByBlog(Blog blog);
}
