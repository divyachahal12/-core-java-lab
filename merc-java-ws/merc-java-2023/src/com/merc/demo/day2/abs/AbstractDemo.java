package com.merc.demo.day2.abs;

public class AbstractDemo {
	public static void main(String[] args) {
			
		Hdfc bank1 = new Hdfc();
		bank1.doKyc();
		SomeInterface.staticMethod();
		bank1.defaultMethod();
		
		Icici bank2 = new Icici();
		bank2.doKyc();
		
	}
}
