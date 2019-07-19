package com.w3cjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.w3cjava.filter.AccessFilter;
/**
 * 
 * @class  ZuulApiGatewayApplication
 * @version 1.0.0
 * @author cos
 * @desc   
 * 01-SpringCloud-Eureka-server
 * 02-SpringCloud-Eureka-client
 * 03-SpringCloud-Eureka-consumer
 * http://localhost:1101/eureka-client/dc
 * http://localhost:1101/eureka-consumer/consumer
 * 路由规则：
 * 	1、zuul.routes.<route>.path与zuul.routes.<route>.serviceId
 * 	zuul.routes.user-service.path=/user-service/**
	zuul.routes.user-service.serviceId=user-service/
	2、zuul.routes.<serviceId>=<path>
	zuul.routes.user-service=/user-service/**

 *
 */
//使用@EnableZuulProxy注解开启Zuul的功能
@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
public class ZuulApiGatewayApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZuulApiGatewayApplication.class, args);
	}
	
	
	//在实现了自定义过滤器之后，它并不会直接生效，我们还需要为其创建具体的Bean才能启动该过滤器
	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}
}
