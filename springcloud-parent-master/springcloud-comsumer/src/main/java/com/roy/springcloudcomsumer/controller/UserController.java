package com.roy.springcloudcomsumer.controller;

import com.roy.springcloudcommons.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("comsumer/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value="jia", produces = "text/html;charset=utf-8")
    public String jia(int n1,int n2){

        return "求和结果："+userService.addition(n1,n2);
    }

    @GetMapping(value = "jian",produces = "text/html;charset=utf-8")
    public String jian(int n1,int n2){

        return "相减结果："+userService.subtraction(n1,n2);
    }
}
