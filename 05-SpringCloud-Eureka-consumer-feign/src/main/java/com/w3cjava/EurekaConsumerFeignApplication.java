package com.w3cjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
//2、注解开启扫描Spring Cloud Feign客户端的功能
@EnableFeignClients
public class EurekaConsumerFeignApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerFeignApplication.class, args);
	}
}
