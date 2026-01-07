package com.order.test.controller;

import com.order.test.feign.OrderInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@RestController
public class TestController {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private OrderInterface orderInterface;
    @GetMapping("/check")
    public ResponseEntity<String> check(){

        /**
         * Calling deployment service using RestTemplate
         */
//        String res = restTemplate.getForObject(
//                "http://spring-deployment/dep",String.class);

        /**
         * calling deployment service using FeignClient
         */
        String result = orderInterface.printMessage();
        System.out.println(result);
        return ResponseEntity.ok(result);
    }
}
