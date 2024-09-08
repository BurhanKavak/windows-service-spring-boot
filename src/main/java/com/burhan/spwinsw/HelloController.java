package com.burhan.spwinsw;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/hello")
@EnableScheduling
public class HelloController {


    @GetMapping
    public String getHello() {
        return "App is running...! Hello World";
    }

    @Scheduled(fixedDelay = 5000)
    public void print() {
        System.out.println("Current Time : " + new Date());
    }

}
