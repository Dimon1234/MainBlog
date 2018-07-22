package com.devlifeblog.demo.controller;

import com.devlifeblog.demo.model.Blog;
import com.devlifeblog.demo.service.BlogService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api/blog")
@AllArgsConstructor
public class BlogController {
    private BlogService blogService;

    @GetMapping
    public List<Blog> getAll() {
        return blogService.findAll();
    }
}
