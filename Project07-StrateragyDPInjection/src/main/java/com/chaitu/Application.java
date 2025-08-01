package com.chaitu;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.chaitu.sbeans.Journey;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args)) {
			Journey bean = ctx.getBean("j", Journey.class);
			System.out.println(
					bean.traveling(new String[] { "Apple", "Cake", "Water bottle" }, new double[] { 100, 700, 20 }));
		}

		catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
