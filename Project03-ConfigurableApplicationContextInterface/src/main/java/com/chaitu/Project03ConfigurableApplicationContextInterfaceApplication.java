package com.chaitu;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.chaitu.sbeans.A;

@SpringBootApplication
public class Project03ConfigurableApplicationContextInterfaceApplication {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx = SpringApplication.run(Project03ConfigurableApplicationContextInterfaceApplication.class, args)) {
			A bean = ctx.getBean("a",A.class);
			System.out.println(bean);
		} 
	
		catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
