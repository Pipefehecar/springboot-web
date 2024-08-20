package com.lab.pipefehecar.sprintbootweb.controllers;

import com.lab.pipefehecar.sprintbootweb.models.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/posts-controller")
public class PostController {
    @PostMapping("/foo")
    public User foo(@RequestBody User body) {
        return body;
    }
}
