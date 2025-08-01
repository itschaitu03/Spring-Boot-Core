package com.chaitu.sbeans;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.chaitu.commons.Bike;
import com.chaitu.commons.Car;
import com.chaitu.commons.IEngine;

@Component("j")
public class Journey {

	@Autowired
	@Qualifier("c")
	private IEngine e;

	public Journey() {
		System.out.println("Journey :: 0 param Constructor");
	}

	public String traveling(String food[], double amount[]) {
		double p = 0;
		String type = null;
		for (double d : amount) {
			p += d;
		}

		if (e instanceof Car) {
			type = "Car";
		}

		else if (e instanceof Bike) {
			type = "Bike";
		}

		else {
			throw new IllegalArgumentException("Invalid Data");
		}

		return Arrays.toString(food) + " those food we buy in journey at ::" + Arrays.toString(amount)
				+ " price and our total bill amount is ::" + p + " " + e.startEngine("Latur") + e.stopEngine("Pune")
				+ " our travel is going by ::" + type;
	}
}
