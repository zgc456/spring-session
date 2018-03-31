package com.zheng.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by lenovo on 2018/3/29.
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public String name( HttpSession  session){
       session.setAttribute("a","45646");
        return "sad";
    }
}
