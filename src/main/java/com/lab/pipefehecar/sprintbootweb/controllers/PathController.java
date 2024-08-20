package com.lab.pipefehecar.sprintbootweb.controllers;

import com.lab.pipefehecar.sprintbootweb.models.dto.ParamDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/path-variable")
public class PathController {
    @GetMapping("/baz/{param}")
    public ParamDto baz(@PathVariable String param) {
        ParamDto paramDto = new ParamDto();
        paramDto.setCode(Integer.parseInt(param));
        return paramDto;
    }
}
