package com.chaitu;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.chaitu.sbeans.SeasonFinder;

@SpringBootApplication
public class SpringBootProject01Application {

   
	
	@Bean("ldate")
	public LocalDate nowDate() {
		return LocalDate.now();
	}

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = (AnnotationConfigApplicationContext) SpringApplication.run(SpringBootProject01Application.class, args)) {
			System.out.println("SpringBootProject01Application.main()");
			SeasonFinder bean = ctx.getBean("sf",SeasonFinder.class);
			System.out.println("Season ::"+bean.findSeason("Chaitu"));
			System.out.println("SpringBootProject01Application.main()");
		}
		
	}

}
