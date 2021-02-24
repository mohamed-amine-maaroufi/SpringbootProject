package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class SimpleBean {
	
	@Autowired
	private AnotherBean anotherBean;
	@Autowired
	private OneMoreBean oneMoreBean;
	
	
	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}
	public void setOneMoreBean(OneMoreBean oneMoreBean) {
		this.oneMoreBean = oneMoreBean;
	}
	
	public void simpleMethod()
	{
		anotherBean.print();
		oneMoreBean.print();		
	}

}
