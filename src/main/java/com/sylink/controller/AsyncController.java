package com.sylink.controller;

import com.sylink.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {
    @Autowired
    private TestService testService;
    @GetMapping("/aysnc1")
    public String async1(){
        testService.sendMsg("123123");
        return "end";
    }
}
