package com.tinyfan.chapter3.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/log")
public class LogController {
    private static final Logger log = LoggerFactory.getLogger(LogController.class);

    /**
     * @return
     */
    @GetMapping(value = "")
    public String log() {
        String name = "tiny carousel";
        int age = 23;
        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
        log.info("name:" + name + " ,age:" + age);
        log.info("name:{}, age:{}", name, age);
        return "log.....";
    }
}
