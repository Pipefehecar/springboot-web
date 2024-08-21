package com.lab.pipefehecar.springbootweb.controllers;

import com.lab.pipefehecar.springbootweb.models.dto.ParamDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/params")
public class RequestParamController {
    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false ) String message) {
    ParamDto param = new ParamDto();
    param.setMessage(message==null ? "no message" : message);
    return param;
    }

    @GetMapping("/bar")
    public ParamDto bar(@RequestParam String message, @RequestParam Integer code) {
        ParamDto param = new ParamDto();
        param.setMessage(message);
        param.setCode(code);
        return param;

    }
    @GetMapping("/pez")
    public ParamDto pez(HttpServletRequest request) {
        ParamDto param = new ParamDto();
        param.setCode(Integer.parseInt(request.getParameter("code")));
        param.setMessage(request.getParameter("message"));
        return param;
    }

}
