package com.lab.pipefehecar.springbootweb.controllers;


import com.lab.pipefehecar.springbootweb.models.User;
import com.lab.pipefehecar.springbootweb.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserRestController {
    @GetMapping("/details-map")
    public Map<String, Object> detailsMap() {
        User user = new User("Luis", "Herrera");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hello World from Spring Boot");
        body.put("user", user);
        return body;
    }

    @GetMapping("/details")
    public UserDto details() {
        User user = new User("Luis", "Herrera");
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        return userDto;

    }

    @GetMapping("/list")
    public List<User> list() {
        User user1 = new User("Luis", "Herrera");
        User user2 = new User("Maria", "Castillo", 25);
        User user3 = new User("Diana", "Herrera");
        // List<User> users = new ArrayList<>();
        // users.add(user1);
        // users.add(user2);
        // users.add(user3);
        return Arrays.asList(user1, user2, user3);
    }

}
