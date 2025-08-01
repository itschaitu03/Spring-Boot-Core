package com.chaitu.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.chaitu.commons.Bike;
import com.chaitu.commons.Car;
import com.chaitu.commons.IEngine;

@Component("jo")
public class JourneyObject implements FactoryBean<IEngine> {

	@Value("${starter.id}")
	private String IEngine;

	@Override
	public IEngine getObject() throws Exception {
		IEngine e = null;
		if (IEngine.equalsIgnoreCase("c")) {
			e = new Car();
		}

		else if (IEngine.equalsIgnoreCase("b")) {
			e = new Bike();
		}

		else {
			throw new IllegalArgumentException("Invalid Data");
		}
		return e;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return IEngine.class;
	}

}
