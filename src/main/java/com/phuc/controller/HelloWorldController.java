package com.phuc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    public HelloWorldController() {
        System.out.println("HEHEHEHE");
    }

    @GetMapping("/hello")
    public String test() {
        return "/home/hello-world";
    }
}