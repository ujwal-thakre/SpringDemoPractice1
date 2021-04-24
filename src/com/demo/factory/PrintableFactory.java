package com.demo.factory;

public class PrintableFactory {

	public static Printable getPrintable() {
		return new A1();
	}
}
