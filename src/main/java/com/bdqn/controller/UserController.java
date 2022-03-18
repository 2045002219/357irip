package com.bdqn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {
    @ResponseBody
    @RequestMapping("quick")
    public String xxx() {
        System.out.println("Controller save running...");
        System.out.println("11111111111111111111111111");
        return "xxxxxxxx";
    }
    @RequestMapping("xxxget")
    public String x(){
        return "success";
    }
}
