package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreScopesDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Employee emp1 = context.getBean("emp", Employee.class);
		System.out.println("Printing emp1...");
		System.out.println(emp1);
		
		Employee emp2 = context.getBean("emp", Employee.class);
		System.out.println("Printing emp2...");
		System.out.println(emp2);
		emp2.setEmpName("GWEN");
		
		System.out.println("Printing emp2...");
		System.out.println(emp2);
		System.out.println("Printing emp1...");
		System.out.println(emp1); // if the scope of bean remains to default singleton the empName would change to GWEN
									// if the scope of bean is changed to prototype the empName would remain Smith	
		

	}

}
