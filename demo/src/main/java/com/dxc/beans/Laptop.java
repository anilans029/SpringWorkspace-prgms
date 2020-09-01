package com.dxc.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {

	@Override
	public void monitor() {
		// TODO Auto-generated method stub
		System.out.println("17\" Multi touch, amoled");

	}

	@Override
	public void processor() {
		// TODO Auto-generated method stub
		System.out.println("inter core i7, 9Th gen");
	}

	@Override
	public void storage() {
		// TODO Auto-generated method stub
		System.out.println("2tb HDD, 256 GB SSD");
	}

}
