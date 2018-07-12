package com.devlifeblog.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.diomonjeelife.Blog.model.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer> {
}
