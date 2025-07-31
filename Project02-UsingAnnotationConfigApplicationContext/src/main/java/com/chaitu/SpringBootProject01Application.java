package com.chaitu;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chaitu.sbeans.A;

@SpringBootApplication
public class SpringBootProject01Application {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = (AnnotationConfigApplicationContext) SpringApplication
				.run(SpringBootProject01Application.class, args)) {
			A bean = ctx.getBean("a", A.class);
			System.out.println(bean);
		}

		catch (BeansException e) {
			e.printStackTrace();
		}

	}

}
