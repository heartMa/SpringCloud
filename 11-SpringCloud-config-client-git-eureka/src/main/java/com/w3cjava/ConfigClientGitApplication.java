package com.w3cjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * 
 * @class  ConfigClientGitApplication
 * @version 1.0.0
 * @author cos
 * @desc   http://localhost:2004/info
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientGitApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientGitApplication.class, args);
	}
}
