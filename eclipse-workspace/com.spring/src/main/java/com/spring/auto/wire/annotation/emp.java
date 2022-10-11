package com.spring.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class emp {
	@Autowired
	@Qualifier("address2")
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
