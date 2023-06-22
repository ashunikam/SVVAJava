package coreJava6;
import java.time.LocalDate;
import java.util.*;

public class BMWMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice=0, num=0;
		LocalDate date;
		String ans="";
		do {
		System.out.println("Manu");
		System.out.println("1.X1");
		System.out.println("2.X2");
		System.out.println("3.X5");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1: 
			System.out.println("Enter number of cars");
			num=sc.nextInt();
			date=java.time.LocalDate.now();
			for(int i=0;i<num;i++) {
				X1 x1=new X1("Red", 10.45, false,false,date);
			}
			break;
		case 2:
			System.out.println("Enter number of cars");
			num=sc.nextInt();
			date=java.time.LocalDate.now();
			for(int i=0;i<num;i++) {
				X2 x1=new X2("Red", 10.45, false,false,date);
			}
			break;
		case 3:
			System.out.println("Enter number of cars");
			num=sc.nextInt();
			date=java.time.LocalDate.now();
			for(int i=0;i<num;i++) {
				X5 x5=new X5("Red", 10.45, false,false,date);
			}
			break;
		default:
			System.out.println("Invalid choice");
		}
		System.out.println("Do you want to continue");
		ans=sc.next();
		}
		while(ans.equals("y") || ans.equals("Y"));
		int total=X1.x1Cnt+X2.x2Cnt+X5.x5Cnt;
		System.out.println("Total cars sold of type x1 "+" "+X1.x1Cnt);
		System.out.println("Total cars sold of type x2 "+" "+X2.x2Cnt);
		System.out.println("Total cars sold of type x5 "+" "+X5.x5Cnt);
		System.out.println("Total cars sold "+total );
	}

}
