package com.tinycarousel.chapter1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/index")
    public String demo1() {
        return "hello tiny carousel";
    }
}
