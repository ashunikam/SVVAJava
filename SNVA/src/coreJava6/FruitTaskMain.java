package coreJava6;

public class FruitTaskMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple obj1=new Apple("Red", 4.5);
		Mango obj2=new Mango("Yello", 2.3);
		System.out.println("Color of Apple is"+" "+" "+obj1.getColor());
		System.out.println("Average weight of Apple is"+" "+obj1.avgWeight());
		System.out.println("Color of Mango is"+" "+" "+obj2.getColor());
		System.out.println("Average weight of Mano is"+" "+obj2.avgWeight());

	}

}
