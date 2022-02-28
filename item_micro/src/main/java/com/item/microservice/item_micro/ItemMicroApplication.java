package com.item.microservice.item_micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ItemMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemMicroApplication.class, args);
	}

}
