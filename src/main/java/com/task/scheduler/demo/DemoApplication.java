package com.task.scheduler.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication


public class DemoApplication {
	Logger logger = LoggerFactory.getLogger(LoggingController.class);
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
