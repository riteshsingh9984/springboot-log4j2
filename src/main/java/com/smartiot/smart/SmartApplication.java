package com.smartiot.smart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SmartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartApplication.class, args);
	}

}
