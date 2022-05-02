package com.springdemos.springcore.propertyplaceholder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create the spring container - box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/propertyplaceholder/config.xml");

		// get the hospital bean from the container
		MyDAO mydao = (MyDAO) context.getBean("mydao");
		
		// print the bean
		System.out.println(mydao);
	
		
	}

}
