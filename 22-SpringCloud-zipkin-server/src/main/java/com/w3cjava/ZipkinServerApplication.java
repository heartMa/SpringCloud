package com.w3cjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
//使用@EnableZipkinServer注解来启动Zipkin Server
//http://localhost:9411/
@EnableZipkinServer
public class ZipkinServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZipkinServerApplication.class, args);
	}
}
