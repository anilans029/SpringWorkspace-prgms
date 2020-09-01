package com.dxc.beans;

import org.springframework.stereotype.Component;

@Component
public class PortablePC implements Computer {

	@Override
	public void monitor() {
		// TODO Auto-generated method stub
		System.out.println("no seperate monitor");
	}

	@Override
	public void processor() {
		// TODO Auto-generated method stub
		System.out.println("high end processor");
	}

	@Override
	public void storage() {
		// TODO Auto-generated method stub
		System.out.println("high storage");
	}

}
