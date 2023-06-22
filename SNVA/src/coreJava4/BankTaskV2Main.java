package coreJava4;
import java.util.*;

public class BankTaskV2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice=0;
		String name="";
		String ans="";
		String userName="";
		String password="";
		String[] account= {"AB001","AB002","AB003","AB004","AB005"};
		String[] pass= {"123abc","12bng","45trt","987bvn","wer5"};
		double[] bal= {100,200,300,400,500};
		Scanner sc=new Scanner(System.in);
		System.out.println("--------Welcome to ICICI bank-----------");
		System.out.println("How are you doing?");
		ans=sc.next();
		System.out.println("Enter your name");
		name=sc.next();
		System.out.println("Hello"+" "+ans);
		System.out.println("Enter your username");
		userName=sc.next();
		System.out.println("Enter your password");
		password=sc.next();
		BalanceV2 obj=new BalanceV2(userName,password,account,pass,bal,name,ans);
		if(obj.isAuthenticate(userName, password)) {
			System.out.println("Welcome to Home page");
			do {
				System.out.println("Manu");
				System.out.println("1. Check Balance");
				System.out.println("Enter 1 for checking balance");
				choice=sc.nextInt();
				switch(choice) {
				case 1: double balance=obj.getBalance(userName);
					System.out.println(balance);
				break;
				default:
					System.out.println("Entered wrong credentials");
				}
				System.out.println("Would you link to logOff");
				ans=sc.next();
				if(ans.equals("Y")||ans.equals("y")) {
					System.out.println("You logged off successfully");
				}
			}
			while(ans.equals("n")||ans.equals("N"));
			
		}else {
			System.out.println("You have entered wrong password");
		}
		
		
		
	}

}
