package com.w3cjava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.w3cjava.service.ConsumerService;

@RestController
public class DcController {
    @Autowired
    ConsumerService consumerService;

    //http://localhost:21001/consumer
    @GetMapping("/consumer")
    public String dc() {
        return consumerService.consumer();
    }
    
    //服务超时,http://localhost:21001/consumer1
    @GetMapping("/consumer1")
    public String dc1() {
        return consumerService.consumer1();
    }
}