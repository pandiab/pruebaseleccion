package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class HelloWorldController {
    @RequestMapping("/")  
    public String hello() {  
        return "Holanda, que Talca InstanceLatam :)";  
    }

    @RequestMapping("/ping")  
    public String ping() {
        return "pong";  
    }
}  
