package com.testing;

public class A {

	public static void main(String[] args) {
		System.out.println("printing from A class main method ");

		A a = new A();
		a.m1();
		B b = new B();
		b.m3();
	}
	public void m1()
	{
		System.out.println("this is the method 1");
	}
	
	public static void m2() {
		System.out.println("this is the method 2 ");
	}
	

}
