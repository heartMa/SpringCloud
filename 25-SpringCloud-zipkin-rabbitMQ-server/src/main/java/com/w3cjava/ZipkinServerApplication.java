package com.w3cjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;


@SpringBootApplication
//使用@EnableZipkinServer注解来启动Zipkin Server
//http://localhost:9411/
//rabbitMQ使用此@EnableZipkinServer注解无效，需使用@EnableZipkinStreamServer
@EnableZipkinStreamServer
public class ZipkinServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZipkinServerApplication.class, args);
	}
}
