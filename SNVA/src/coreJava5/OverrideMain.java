package coreJava5;

public class OverrideMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Override o1=new Override();
		o1.i=10;
		o1.j=20;
		System.out.println(o1.sum(o1.i, o1.j));
		OverrideSub s1=new OverrideSub();
		System.out.println(s1.sum(10, 0));
		

	}

}
