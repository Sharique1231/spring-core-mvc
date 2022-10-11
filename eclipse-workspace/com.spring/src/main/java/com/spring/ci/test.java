package com.spring.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/ci/ciconfig.xml");
     person person=(person)context.getBean("person");
     Additon add=(Additon)context.getBean("Additon");
     add.dosum();
	 }

}
