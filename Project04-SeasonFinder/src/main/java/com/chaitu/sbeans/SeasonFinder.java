package com.chaitu.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {

	@Autowired
	private LocalDate date;
	
	public SeasonFinder() {
		System.out.println("SeasonFinder :: 0 param Constructor");
	}
	
	public String findSeason(String name) {
		int month=date.getMonthValue();
		String season;
		if(month<=3)
			season=" Spring Season :: " +name;
		
		else if(month<6)
			season=" Summer Season :: " +name;
		
		else if(month<9)
			season= " Rainy/Autumn Season :: " +name;
		
		else 
			season= " Winter Season :: " +name;
		
		return season;
	}
}
