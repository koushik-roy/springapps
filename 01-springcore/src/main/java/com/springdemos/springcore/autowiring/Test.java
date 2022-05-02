package com.springdemos.springcore.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create the spring container - box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/autowiring/config.xml");

		// get the hospital bean from the container
		Employee emp = (Employee) context.getBean("emp");
		
		// print the bean
		System.out.println(emp);
	}

}
