package com.sda.spring.mvc.hibernate.controllor;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
    public String home(){
        return "This is the home page";
    }
}
