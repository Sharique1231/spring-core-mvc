package com.spring.ci;

public class Additon {
	private int a;
	private int b;
	public Additon(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Contructor:int,int");
		
	}
	public Additon(double a, double b) {
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Contructor:double,double");
	}
	public Additon(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Contructor:String,String");
	}
		
	
	public void dosum() {
		System.out.println("sum is "+(this.a+this.b));
		
	}
}
	
	
	


