package com.tp1.microsservice.microsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicrosserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrosserviceApplication.class, args);
	}

}
