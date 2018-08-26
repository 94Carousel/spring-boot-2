package com.tinyfan.chapter1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping(value = "/")
@RestController
public class HelloController {

    @GetMapping(value = "hello")
    public String hello(){
        return "hello";
    }
}
