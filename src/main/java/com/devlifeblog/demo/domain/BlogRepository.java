package com.devlifeblog.demo.domain;

import com.devlifeblog.demo.model.Blog;
import com.devlifeblog.demo.model.BlogUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {
    Optional<Blog> findBlogByBlogUser(BlogUser blogUser);

    Optional<Blog> findBlogByBlogName(String name);
}
