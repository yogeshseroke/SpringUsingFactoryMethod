package com.factoryexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringFactoryContext.xml");
		A a=(A)context.getBean("a");
		a.msg();
	}

}
