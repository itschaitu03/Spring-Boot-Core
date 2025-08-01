package com.chaitu;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.chaitu.sbeans.SundayFinder;

@SpringBootApplication
public class SpringBootProject {

	@Bean("ldate")
	public LocalDate nowDate() {
		return LocalDate.now();
	}

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = (AnnotationConfigApplicationContext) SpringApplication
				.run(SpringBootProject.class, args)) {
			System.out.println("SpringBootProject01Application.main()");
			SundayFinder bean = ctx.getBean("sf", SundayFinder.class);
			System.out.println("Sunday ::" + bean.findSunday("Chaitu"));
			System.out.println("SpringBootProject01Application.main()");
		}

	}

}
