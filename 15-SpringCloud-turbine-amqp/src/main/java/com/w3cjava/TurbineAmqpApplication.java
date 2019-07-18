package com.w3cjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;
import org.springframework.context.annotation.Configuration;
@Configuration
@EnableAutoConfiguration
//注解来启用Turbine Stream的配置
@EnableTurbineStream
@EnableDiscoveryClient
public class TurbineAmqpApplication {
	public static void main(String[] args) {
		SpringApplication.run(TurbineAmqpApplication.class, args);
	}
}
