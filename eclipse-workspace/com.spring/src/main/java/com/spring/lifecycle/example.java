package com.spring.lifecycle;

public class example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "example [subject=" + subject + "]";
	}
  
	 public void start() {
     System.out.println("starting");		
	}
	 public void end() {
		 System.out.println("ending");
		
	}
	
}
