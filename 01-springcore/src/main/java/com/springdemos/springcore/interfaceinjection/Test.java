package com.springdemos.springcore.interfaceinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/interfaceinjection/config.xml");

		Coach coach = (Coach) context.getBean("coach");

		System.out.println(coach);

	}

}
