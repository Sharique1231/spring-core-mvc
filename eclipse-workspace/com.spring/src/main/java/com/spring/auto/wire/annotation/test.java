package com.spring.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/auto/wire/annotation/autoconfig.xml");
		emp emp1=context.getBean("emp",emp.class);
		System.out.println(emp1);
    
	}

}
