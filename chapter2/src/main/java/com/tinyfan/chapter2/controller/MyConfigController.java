package com.tinyfan.chapter2.controller;

import com.tinyfan.chapter2.configration.Configuration1;
import com.tinyfan.chapter2.configration.Configuration2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/config")
@RestController
public class MyConfigController {
    private static final Logger log = LoggerFactory.getLogger(MyConfigController.class);
    private final Configuration1 configuration1;
    private final Configuration2 configuration2;

    @Autowired
    public MyConfigController(Configuration1 configuration1, Configuration2 configuration2) {
        this.configuration1 = configuration1;
        this.configuration2 = configuration2;
    }

    @GetMapping("/1")
    public Configuration1 config1(){
        log.info("==================================");
        log.info(configuration1.toString());
        log.info("==================================");
        return configuration1;
    }

    @GetMapping("/2")
    public Configuration2 config2(){
        log.info("==================================");
        log.info(configuration2.toString());
        log.info("==================================");
        return configuration2;
    }
}
