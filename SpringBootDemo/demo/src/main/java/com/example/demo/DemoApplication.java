package com.example.demo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(DemoApplication.class, args);
	Alien alien= context.getBean(Alien.class);
	alien.show();
	}

}
