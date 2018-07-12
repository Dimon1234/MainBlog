package com.devlifeblog.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.diomonjeelife.Blog.model.Article;
import ru.diomonjeelife.Blog.model.Blog;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
     List<Article> findAllByBlog(Blog blog);
}
