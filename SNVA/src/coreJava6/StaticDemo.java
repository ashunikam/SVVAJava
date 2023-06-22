package coreJava6;

public class StaticDemo {
	static int num1=100;
	static int num2=200;
	static void display1() {
		System.out.println("Num1: "+ num1);
	}
	{
		System.out.println("local block");
	}
	static {
		System.out.println("From static block");
		System.out.println("Product "+(num1*num2));
	}
	void sum() {
		System.out.println("Executing sum function "+(num1+num2));
	}
}
