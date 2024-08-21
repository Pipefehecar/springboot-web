package com.lab.pipefehecar.springbootweb.controllers;

import com.lab.pipefehecar.springbootweb.models.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/posts-controller")
public class PostController {
    @Value("${config.developerNickname}")
    private String nickname;
    @Value("${config.code}")
    private Integer code;
    @Value("${config.listOfValues}")
    private String[] listOfValues;

    @PostMapping("/foo")
    public User foo(@RequestBody User body) {
        return body;
    }
    @GetMapping("/values")
    public Map<String, Object> values() {
        Map<String, Object> map = new HashMap<>();
        map.put("nickname", nickname);
        map.put("code", code);
        map.put("listOfValues", listOfValues);
        return map;
    }
}
