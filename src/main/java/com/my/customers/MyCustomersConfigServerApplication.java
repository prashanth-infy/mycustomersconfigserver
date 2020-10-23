package com.my.customers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MyCustomersConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCustomersConfigServerApplication.class, args);
	}

}
