package com.example.lab5_20204205gtics.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String loginWindow(){
        return "loginWindow";
    }
}
