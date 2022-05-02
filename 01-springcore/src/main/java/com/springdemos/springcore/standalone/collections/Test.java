package com.springdemos.springcore.standalone.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/standalone/collections/config.xml");

		// get the hospital bean from the container
		ProductsList prods = (ProductsList) context.getBean("products");
		
		// print the bean
		System.out.println(prods);
		System.out.println(prods.getProductNames().getClass());
	}

}
