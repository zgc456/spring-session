package com.zheng.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestService {
    @GetMapping("asd")
    public String test(HttpSession session){
        System.out.println(session.getAttribute("a"));
    return "测试";
    }
}
