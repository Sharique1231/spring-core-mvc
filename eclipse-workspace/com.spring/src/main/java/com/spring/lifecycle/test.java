package com.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/spring/lifecycle/config.xml");
    /*   samosa s1=(samosa) context.getBean("s1");
       System.out.println(s1);
       context.registerShutdownHook();
       pepsi p1=(pepsi) context.getBean("p1");
       System.out.println(p1);*/
       context.registerShutdownHook();
       example ex=(example)context.getBean("ex");
       System.out.println(ex);
	}

}
