package com.spring.collections;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/collections/collectionsconfig.xml");
		Employee Emp=(Employee)context.getBean("employee1");
        System.out.println(Emp.getPhones());
         
  
	}

}
