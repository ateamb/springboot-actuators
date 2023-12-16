package com.javabanters.springboot.demo.myApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    //expose an endpoint
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

}
