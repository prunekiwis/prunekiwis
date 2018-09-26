package com.example.sampledocker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    
	@RequestMapping("/")
    public String hello(){
        return "Hello Spring boot docker ver 3!";
    }

}
