package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
    @GetMapping("/hello1")
    @ResponseBody
    public String getHello() {

        System.out.println("你好啊！！");
        return "Hello 左先生";
    }

}
