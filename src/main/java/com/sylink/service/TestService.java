package com.sylink.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class TestService {
    public static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    @Async
    public void sendMsg(String message){
        try{
            System.out.println("start senfMsg" + simpleDateFormat.format(new Date(System.currentTimeMillis())));
            Thread.sleep(5000);
            System.out.println("sendMsg :" + message);
            System.out.println("end sendMsg" + simpleDateFormat.format(new Date(System.currentTimeMillis())));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
