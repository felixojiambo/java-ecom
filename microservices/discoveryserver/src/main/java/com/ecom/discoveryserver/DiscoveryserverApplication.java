package com.ecom.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableEurekaServer
@SpringBootApplication
public class DiscoveryserverApplication {

	public static void main(String[] args) {

		SpringApplication.run(DiscoveryserverApplication.class, args);
		System.out.println("Discovery Server");
	}

}