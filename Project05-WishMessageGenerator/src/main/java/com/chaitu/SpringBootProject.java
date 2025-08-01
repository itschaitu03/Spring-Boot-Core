package com.chaitu;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.chaitu.sbeans.WishMessageGenerator;

@SpringBootApplication
public class SpringBootProject {

	@Bean("ltime")
	public LocalTime nowDate() {
		return LocalTime.now();
	}

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = (AnnotationConfigApplicationContext) SpringApplication
				.run(SpringBootProject.class, args)) {
			System.out.println("SpringBootProject01Application.main()");
			WishMessageGenerator bean = ctx.getBean("wmg", WishMessageGenerator.class);
			System.out.println("Wish message ::" + bean.findMessage("Chaitu"));
			System.out.println("SpringBootProject01Application.main()");
		}

	}

}
