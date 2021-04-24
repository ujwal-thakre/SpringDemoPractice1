package com.demo.factory;

public class A {

	private static final A obj = new A();

	private A() {
		System.out.println("private Constructor..");
	}

	public static A getA() {
		return obj;
	}

	public void show() {
		System.out.println("Hellow A...");
	}

}
