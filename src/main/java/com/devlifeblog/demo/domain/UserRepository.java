package com.devlifeblog.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.diomonjeelife.Blog.model.BlogUser;

@Repository
public interface UserRepository extends JpaRepository<BlogUser, Integer> {
}
