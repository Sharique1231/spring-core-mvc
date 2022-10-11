package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		ApplicationContext context =new ClassPathXmlApplicationContext("com/spring/ref/refconfig.xml");
	    A temp=(A) context.getBean("aref");
	    System.out.println(temp);
	
	}

}
