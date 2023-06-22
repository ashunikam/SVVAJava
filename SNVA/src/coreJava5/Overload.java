package coreJava5;

public class Overload {
	int num1=10, num2=20, sum=0;
	void sum() {
		sum=num1+num2;
		System.out.println(sum);
	}
	void sum(double num1, int num2) {
		System.out.println(num1+num2);
	}
}
