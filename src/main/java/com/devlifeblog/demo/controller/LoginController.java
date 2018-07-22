package com.devlifeblog.demo.controller;

import com.devlifeblog.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/login")
@AllArgsConstructor
public class LoginController {
    private final UserService userService;
}
