package com.w3cjava.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Trace1Controller {
	private final Logger logger = Logger.getLogger(getClass());
	@Autowired
	RestTemplate restTemplate;
	@RequestMapping(value = "/trace-1", method = RequestMethod.GET)
	public String trace() {
		logger.info("===call trace-1===");
		return restTemplate.getForObject("http://trace-2/trace-2", String.class);
	}
}
