package com.devlifeblog.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.diomonjeelife.Blog.model.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog,Integer> {
}
