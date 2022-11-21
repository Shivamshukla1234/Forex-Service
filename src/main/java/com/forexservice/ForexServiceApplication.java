package com.forexservice;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class ForexServiceApplication {


 public static  Logger logger =LoggerFactory.getLogger(ForexServiceApplication.class);
 @PostConstruct
 public void initt(){
	 logger.info("Application started ....");
 }
	public static void main(String[] args) {
		logger.info("Application started ....");
		SpringApplication.run(ForexServiceApplication.class, args);
	}

}
