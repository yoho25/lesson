package com.sylink.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/gethello/{userId}/{password}")
    public String testGet(@PathVariable String userId,@PathVariable String password){
        return "get world !" + userId + password;
    }

    @PostMapping("/posthello")
    public String testPost(){
        return "post world";
    }
}
