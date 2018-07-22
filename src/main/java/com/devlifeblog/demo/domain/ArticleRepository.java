package com.devlifeblog.demo.domain;

import com.devlifeblog.demo.model.Article;
import com.devlifeblog.demo.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
    @Query("select Article from Article art where art.blog = blog and art.articleType = com.devlifeblog.demo.model.enums.ArticleType.USER")
    List<Article> findAllByBlog(@Param("blog") Blog blog);

    @Query("select Article from Article art where art.articleType = com.devlifeblog.demo.model.enums.ArticleType.NEWS")
    List<Article> findAllArticleForNews();

}
