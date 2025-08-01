package com.chaitu.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SundayFinder {

	@Autowired
	private LocalDate date;

	public SundayFinder() {
		System.out.println("SundayFinder :: 0 param Constructor");
	}

	public String findSunday(String name) {
		int day = date.getDayOfWeek().getValue();
		String msg;
		if (day == 7) {
			msg = " Today is Sunday and Holiday :: " + name;
		} else {
			msg = " No, Today is working day :: " + name;
		}

		return msg;
	}
}
