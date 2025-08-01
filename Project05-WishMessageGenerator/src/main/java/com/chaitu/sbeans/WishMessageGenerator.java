package com.chaitu.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	@Autowired
	private LocalTime date;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator :: 0 param Constructor");
	}

	public String findMessage(String name) {
		int time = date.getHour();
		String msg;
		if (time >= 6 && time <= 12) {
			msg = " Good Morning :: " + name;
		} else if (time <= 16) {
			msg = " Good Afternoon :: " + name;
		} else if (time <= 20) {
			msg = " Good Evening :: " + name;
		} else {
			msg = " Good Night :: " + name;
		}

		return msg;
	}
}
