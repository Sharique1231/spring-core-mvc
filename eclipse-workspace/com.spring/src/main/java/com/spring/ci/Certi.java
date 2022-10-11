package com.spring.ci;

public class Certi {
	private String name;

	public Certi(String nameString) {
		super();
		this.name = nameString;
	}

	public String getName() {
		return name;
	}

	public void setName(String nameString) {
		this.name = nameString;
	}

	@Override
	public String toString() {
		return "Certi [name=" + name + "]";
	}
	

}
