package com.tinyfan.chapter2.controller;

import com.tinyfan.chapter2.configration.MyConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/my")
@RestController
public class MyConfigController {
    private static final Logger log = LoggerFactory.getLogger(MyConfigController.class);
    private final MyConfiguration myConfiguration;

    @Autowired
    public MyConfigController(MyConfiguration myConfiguration) {
        this.myConfiguration = myConfiguration;
    }

    @GetMapping("/config")
    public MyConfiguration config(){
        log.info("==================================");
        log.info(myConfiguration.toString());
        log.info("==================================");
        return myConfiguration;
    }
}
