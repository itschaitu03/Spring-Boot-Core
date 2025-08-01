package com.chaitu.commons;

public class Bike implements IEngine {

	public Bike() {
		System.out.println("Bike :: 0 param Constructor");
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
