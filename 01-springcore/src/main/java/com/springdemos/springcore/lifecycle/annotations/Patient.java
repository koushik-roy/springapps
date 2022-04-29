package com.springdemos.springcore.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Inside the id setter method..");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	@PreDestroy
	public void bye() {
		System.out.println("Inside bye method...");
	}

	@PostConstruct
	public void hi() {
		System.out.println("Inside hi method...");
	}

}
