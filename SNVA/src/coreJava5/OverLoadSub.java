package coreJava5;

public class OverLoadSub extends Overload{
	int sum(int i, int j) {
		return i+j;
	}
	void sum(double num1, double num2) {
		System.out.println(num1+num2);
	}
}
