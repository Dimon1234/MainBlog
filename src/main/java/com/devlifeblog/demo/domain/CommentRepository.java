package com.devlifeblog.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.diomonjeelife.Blog.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
