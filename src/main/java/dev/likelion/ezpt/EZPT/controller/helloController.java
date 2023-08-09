package dev.likelion.ezpt.EZPT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
