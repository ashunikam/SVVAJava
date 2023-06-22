package coreJava5;

public class StaticDemo {
	static int num1=100;
	static int num2=200;
	static void displayNum1() {
		System.out.println("Num1"+" "+ num1);
	}
	static {
		System.out.println("From static Block");
		System.out.println("Product"+" "+(num1*num2));
	}

}
