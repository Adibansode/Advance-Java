package com.demo.controller;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootHello1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootHello1Application.class, args);
		/*for(String name:ctx.getBeanDefinitionNames()) {
			System.out.println(name);
		}*/
		
	}

}