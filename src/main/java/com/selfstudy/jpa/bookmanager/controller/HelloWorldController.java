package com.selfstudy.jpa.bookmanager.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "hello-world"; //컨트롤 + 쉬프트 + t 하면 junit 테스트 할 수 있음
    }
}
