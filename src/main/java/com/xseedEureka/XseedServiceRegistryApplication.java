package com.xseedEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class XseedServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(XseedServiceRegistryApplication.class, args);
	}

}
