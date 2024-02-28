package com.xseedEureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class XseedServiceRegistryApplication {
	   private static final Logger logger = LoggerFactory.getLogger(XseedServiceRegistryApplication.class);
	public static void main(String[] args) {
	//	SpringApplication.run(XseedServiceRegistryApplication.class, args);
		 try {
	            SpringApplication.run(XseedServiceRegistryApplication.class, args);
	        } catch (Exception e) {
	            logger.error("Error during application startup: {}", e.getMessage(), e);
	          
	        }
	}

}
