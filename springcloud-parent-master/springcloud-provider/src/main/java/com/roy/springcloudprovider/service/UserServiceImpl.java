package com.roy.springcloudprovider.service;

import com.roy.springcloudcommons.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("provider/api/user")
public class UserServiceImpl implements UserService {
    @GetMapping("addition")
    @Override
    public int addition(int n1, int n2) {
        return n1+n2;
    }

    @GetMapping("subtraction")
    @Override
    public int subtraction(int n1, int n2) {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return n1>n2?n1-n2:n2-n1;
    }
}
