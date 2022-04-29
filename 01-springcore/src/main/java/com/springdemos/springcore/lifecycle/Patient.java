package com.springdemos.springcore.lifecycle;

public class Patient {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Inside the id setter method..");
	}
	
	// Init method. Name of the method can be anything
	public void hi() {
		System.out.println("Inside method.. hi");
	}
	
	// destroy method. name of the method can be anything
	public void bye() {
		System.out.println("Inside metohd.. bye");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
