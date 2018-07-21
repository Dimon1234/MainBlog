package com.devlifeblog.demo.domain;

import com.devlifeblog.demo.model.BlogUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<BlogUser, Integer> {
}
