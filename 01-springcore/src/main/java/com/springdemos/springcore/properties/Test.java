package com.springdemos.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create the spring container - box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/properties/config.xml");

		// get the hospital bean from the container
		Locations locations = (Locations) context.getBean("locations");
		
		// print the bean
		System.out.println(locations);
		System.out.println(locations.getDialect().getClass());
	}

}
