package com.example.demo;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;

public class JavaConfig {
	
	@Bean
	public AnotherBean anotherBean()
	{
		return new AnotherBean();
	}
	
	
	@Bean
	public OneMoreBean oneMoreBean()
	{
		return new OneMoreBean();
	}
	
	
	@Bean(autowire = Autowire.BY_TYPE)
	public SimpleBean simpleBean()
	{
		return new SimpleBean();
	}
	

}
