package com.chaitu.sbeans;

import org.springframework.stereotype.Component;

@Component("a")
public class A {

	public A() {
		System.out.println("A :: 0 param Constructor");
	}

	@Override
	public String toString() {
		return "A [getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
