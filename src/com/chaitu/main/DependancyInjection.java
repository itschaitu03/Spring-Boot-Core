package com.chaitu.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.chaitu.sbeans.SeasonFinder;

public class DependancyInjection {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/chaitu/cfgs/applicationContext.xml");
		Object o=ctx.getBean("sf");
		SeasonFinder s=(SeasonFinder)o;
		String result=s.showSeason("Chaitu");
		System.out.println("Season Finder by Month ::"+result);
		ctx.close();
	}
}
