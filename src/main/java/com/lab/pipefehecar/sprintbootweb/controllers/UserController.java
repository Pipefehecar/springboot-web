package com.lab.pipefehecar.sprintbootweb.controllers;

import com.lab.pipefehecar.sprintbootweb.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Maria", "Castillo", 25);
        model.addAttribute("title", "Hello World with spring boot");
        model.addAttribute("name", "Luis");
        model.addAttribute("lastName", "Herrera");
        model.addAttribute("user", user);

        return "details";
    }
}
