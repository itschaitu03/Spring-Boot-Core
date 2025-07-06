package com.chaitu.sbeans;

import java.time.LocalDate;

public class SeasonFinder {
	
	private LocalDate month;
	private LocalDate date;
	private int days;
	private String monthName;
	
	public SeasonFinder() {
		System.out.println("SeasonFinder::0 parameter constructor");
	}

	public void setMonth(LocalDate month) {
		System.out.println("SeasonFinder.setMonth()");
		this.month = month;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}

	public String showSeason(String userName) {
		int monthNo=month.getMonthValue();
		
		if(monthNo <6)
			return "Welcome to Summer Season : "+userName +" "+date.getDayOfYear()+" "+days+" "+monthName;
		
		else if(monthNo <9)
			return "Welcome to Rainy Season : "+userName+" "+date.getDayOfYear()+" "+days+" "+monthName;
		
		else
				return "Welcome to Winter Season : "+userName+" "+date.getDayOfYear()+" "+days+" "+monthName;
	}
}
