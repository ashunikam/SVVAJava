package coreJava5;

public class FigureMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1=new Triangle(3,4);
		System.out.println(t1.area());
		Rectangle r1=new Rectangle(2,4);
		System.out.println(r1.area());
		Figure figure;
		figure=r1;
		System.out.println(figure.area());
		figure=t1;
		System.out.println(figure.area());
		

	}

}
