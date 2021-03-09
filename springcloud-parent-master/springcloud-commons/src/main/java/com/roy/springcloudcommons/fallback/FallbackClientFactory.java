package com.roy.springcloudcommons.fallback;

import com.roy.springcloudcommons.service.UserService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class FallbackClientFactory implements FallbackFactory<UserService> {
    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
            @Override
            public int addition(int n1, int n2) {
                return 0;
            }

            @Override
            public int subtraction(int n1, int n2) {
                System.out.println("减法熔断");
                return 0;
            }
        };
    }
}
