package coreJava6;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ferrari ferrari=new Ferrari("Red", 12.56, true, true);
		System.out.println("------------------------------");
		ferrari.getFeatures("Red", 12.56, true, true);
		System.out.println("------------------------------");
		ferrari.getFeatures("Red", 12.56);

	}

}
