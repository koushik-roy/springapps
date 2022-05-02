package com.springdemos.springcore.interfaceinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Coach {

	@Value("1003")
	private int id = 9;

	@Value("William")
	private String name;
	
	@Autowired
	@Qualifier("cricket")
	private Sport sport;

	@Override
	public String toString() {
		return "Coach [id=" + id + ", name=" + name + ", sport=" + sport.play() + "]";
	}



}
