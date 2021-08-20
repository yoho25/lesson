package com.sylink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class lessonApplication {
    public static void main(String[] args){
        SpringApplication.run(lessonApplication.class,args);
    }
}
