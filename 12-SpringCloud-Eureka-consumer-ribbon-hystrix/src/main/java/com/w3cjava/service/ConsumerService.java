package com.w3cjava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class ConsumerService {
	@Autowired
    RestTemplate restTemplate;

	
	//增加@HystrixCommand注解来指定服务降级方法
    @HystrixCommand(fallbackMethod = "fallback")
    public String consumer() {
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }
    //增加@HystrixCommand注解来指定服务降级方法，请求超时服务，模拟降级效果
    @HystrixCommand(fallbackMethod = "fallback")
    public String consumer1() {
        return restTemplate.getForObject("http://eureka-client/dc1", String.class);
    }
    public String fallback() {
        return "fallback";
    }
}
