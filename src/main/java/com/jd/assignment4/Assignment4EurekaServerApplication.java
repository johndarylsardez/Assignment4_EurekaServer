package com.jd.assignment4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Assignment4EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Assignment4EurekaServerApplication.class, args);
	}

}
