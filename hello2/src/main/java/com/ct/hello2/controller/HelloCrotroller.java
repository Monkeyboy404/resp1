package com.ct.hello2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloCrotroller {


    @GetMapping("/wuyou")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }

}
