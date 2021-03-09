package com.roy.springcloudcommons.service;

import com.roy.springcloudcommons.fallback.FallbackClientFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="springcloud-provider/provider/api/user",fallback = FallbackClientFactory.class)
public interface UserService {
    @GetMapping("addition")
    public int addition(@RequestParam("n1") int n1, @RequestParam("n2") int n2);

    @GetMapping("subtraction")
    public int subtraction(@RequestParam("n1")int n1,@RequestParam("n2")int n2);
}
