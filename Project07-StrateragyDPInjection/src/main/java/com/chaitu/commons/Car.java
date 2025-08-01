package com.chaitu.commons;

import org.springframework.stereotype.Component;

@Component("c")
public class Car implements IEngine {

	public Car() {
		System.out.println("Car :: 0 param Constructor");
	}

	@Override
	public String startEngine(String location) {
		return " Our journey is started from :: " + location;
	}

	@Override
	public String stopEngine(String location) {
		return " and now will be complete at ::" + location;
	}

}
