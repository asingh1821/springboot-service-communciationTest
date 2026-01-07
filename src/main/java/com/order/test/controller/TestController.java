package com.order.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/check")
    public ResponseEntity<String> check(){
        String res = restTemplate.getForObject(
                "http://spring-deployment/dep",String.class);
        return ResponseEntity.ok(res);
    }
}
