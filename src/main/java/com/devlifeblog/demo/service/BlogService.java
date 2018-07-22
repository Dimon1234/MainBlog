package com.devlifeblog.demo.service;

import com.devlifeblog.demo.domain.BlogRepository;
import com.devlifeblog.demo.model.Blog;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BlogService {
    private final BlogRepository blogRepository;

    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    public Blog createBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    public Blog updateBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    public void deleteBlog(String name) {
        Optional<Blog> blog = blogRepository.findBlogByBlogName(name);
        blog.ifPresent(blogRepository::delete);
    }
}
