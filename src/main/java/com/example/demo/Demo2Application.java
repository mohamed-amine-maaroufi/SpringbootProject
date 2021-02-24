package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		//Bean bn = (Bean)context.getBean("bean");
		//bn.shout();
		//SimpleBean bn = (SimpleBean)context.getBean("simpleBean");
		//bn.simpleMethod();
		
		
		//ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		SimpleBean bn = (SimpleBean)context.getBean("simpleBean");
		bn.simpleMethod();
	}

}
