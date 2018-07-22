package com.devlifeblog.demo.domain;

import com.devlifeblog.demo.model.Article;
import com.devlifeblog.demo.model.Blog;
import com.devlifeblog.demo.model.BlogUser;
import com.devlifeblog.demo.model.enums.ArticleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {

    default List<Article> findAllUserArticles(BlogUser user) {
        return findAllByBlogAndArticleTypeOrderByDateTime(user.getBlog(), ArticleType.USER);
    }

    default List<Article> findAllNewsArticles() {
        return findAllByArticleType(ArticleType.NEWS);
    }

    List<Article> findAllByArticleType(@Param("type") ArticleType articleType);

    List<Article> findAllByBlogAndArticleTypeOrderByDateTime(Blog blog, ArticleType type);
}
