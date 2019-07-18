package com.w3cjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
/**
 * 
 * @class  EurekaConsumerRibbonHystrixApplication
 * @version 1.0.0
 * @author cos
 * @desc   01-SpringCloud-Eureka-server与02-SpringCloud-Eureka-client结合使用实现Hystrix容错
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
//使用@EnableCircuitBreaker或@EnableHystrix注解开启Hystrix的使用,这里我们还可以使用Spring Cloud应用中的@SpringCloudApplication注解来修饰应用主类，该注解的具体定义如下所示。我们可以看到该注解中包含了上我们所引用的三个注解，这也意味着一个Spring Cloud标准应用应包含服务发现以及断路器。
@EnableCircuitBreaker
public class EurekaConsumerRibbonHystrixApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerRibbonHystrixApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
