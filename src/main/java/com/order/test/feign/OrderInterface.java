package com.order.test.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("spring-deployment")
public interface OrderInterface {

    @GetMapping("/dep")
    public String printMessage();
}
