package com.w3cjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
/**
 * 
 * @class  Trace1Application
 * @version 1.0.0
 * @author cos
 * @desc 	[trace-1,f410ab57afd5c145,a9f2118fa2019684,false]含义说明：
 * 		  	第一个值：trace-1，它记录了应用的名称，也就是application.properties中spring.application.name参数配置的属性。
			第二个值：f410ab57afd5c145，Spring Cloud Sleuth生成的一个ID，称为Trace ID，它用来标识一条请求链路。一条请求链路中包含一个Trace ID，多个Span ID。
			第三个值：a9f2118fa2019684，Spring Cloud Sleuth生成的另外一个ID，称为Span ID，它表示一个基本的工作单元，比如：发送一个HTTP请求。
			第四个值：false，表示是否要将该信息输出到Zipkin等服务中来收集和展示。
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Trace1Application {
	public static void main(String[] args) {
		SpringApplication.run(Trace1Application.class, args);
	}
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
