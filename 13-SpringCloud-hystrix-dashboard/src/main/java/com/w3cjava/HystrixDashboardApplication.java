package com.w3cjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
/**
 * 
 * @class  HystrixDashboardApplication
 * @version 1.0.0
 * @author cos
 * @desc   	http://localhost:1301/hystrix
 * 			http://localhost:21001/hystrix.stream
 * 
 *
 */
@SpringBootApplication
//启用Hystrix Dashboard功能
@EnableHystrixDashboard
//使用@EnableCircuitBreaker或@EnableHystrix注解，开启了断路器功能
@EnableCircuitBreaker
public class HystrixDashboardApplication {
	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardApplication.class, args);
	}
}
