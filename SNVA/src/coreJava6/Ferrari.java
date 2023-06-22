package coreJava6;

public class Ferrari extends Car{
	public Ferrari(String color, double speed, boolean isSport, boolean convertible) {
		super(color, speed, isSport, convertible);
	}
	public void getFeatures(String color, double speed, boolean isSport, boolean convertible) {
		System.out.println("Ferrari is in "+color+" "+"color");
		System.out.println("It has speed "+ speed);
		if(isSport) {
			System.out.println("Its a sport model");
		}
		else {
			System.out.println("Its not a sport model");
		}
		if(convertible) {
			System.out.println("It's a convertible");
		}
		else {
			System.out.println("It's not a convertible");
		}
	}
	public void getFeatures(String color, double speed, boolean isSport) {
		System.out.println("Car is in "+color+" "+"color");
		System.out.println("Car speed is "+ speed);
		if(isSport) {
			System.out.println("Its a sport model");
		}
		else {
			System.out.println("Its not a sport model");
		}
	}
	public void getFeatures(String color, boolean isSport, double speed) {
		System.out.println("Car is in "+color+" "+"color");
		System.out.println("Car speed is "+ speed);
		if(isSport) {
			System.out.println("Its a sport model");
		}
		else {
			System.out.println("Its not a sport model");
		}
	}
	public void getFeatures(String color, double speed) {
		System.out.println("Car is in "+color+" "+"color");
		System.out.println("Car speed is "+ speed);
	}
	
	
}
