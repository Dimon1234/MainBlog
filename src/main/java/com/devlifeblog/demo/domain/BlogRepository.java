package com.devlifeblog.demo.domain;

import com.devlifeblog.demo.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@Repository
@RestResource
public interface BlogRepository extends JpaRepository<Blog,Integer> {
}
