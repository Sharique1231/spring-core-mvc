package com.spring.auto.wire;

public class emp {
	private address address;

	public address getAddress() {
		return address;
	}

	public void setAddress(address address) {
		this.address = address;
		System.out.println("setting value");
	}

	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public emp(address address) {
		super();
		this.address = address;
		System.out.println("inside constructor");
	}

	@Override
	public String toString() {
		return "emp [address=" + address + "]";
	}

}
