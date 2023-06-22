package coreJava4;
import java.util.*;

public class BankMainTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice=0;
		String[] account= {"AB001","AB002","AB003","AB004","AB005"};
		String[] pass= {"123abc","12bng","45trt","987bvn","wer5"};
		double[] bal= {100,200,300,400,500};
		double[]personalBal= {100,200,300};
		double[]businessBal= {400,500};
		String[] accountPersonal= {"AB001","AB002","AB003"};
		String[] accountBusiness= {"AB004","AB005"};
		String [] accountPersonalPass= {"123abc","12bng","45trt"};
		String[] accountBusinessPass= {"987bvn","wer5"};
		String[] doorNo = {"1", "2", "3", "4", "5"};
        String[] streetNo = {"Street 1", "Street 2", "Street 3", "Street 4", "Street 5"};
        String[] locality = {"Locality 1", "Locality 2", "Locality 3", "Locality 4", "Locality 5"};
        String[] zipCode = {"12345", "23456", "34567", "45678", "56789"};
        String[] mobileNumber = {"1234567890", "2345678901", "3456789012", "4567890123", "5678901234"};
        String[] telephoneNumber = {"1111111111", "2222222222", "3333333333", "4444444444", "5555555555"};

		
		
		BankAcountTask3 obj=new BankAcountTask3(account,pass,bal);
		PersonalDetails personalDetailsObj=new PersonalDetails(account,doorNo, streetNo, locality,zipCode,zipCode,telephoneNumber );
		String ans="";
		String name="";
		String userName="";
		String password="";
		String accountType="";
		Scanner sc=new Scanner(System.in);
		System.out.println("--------Welcome to ICICI bank-----------");
		System.out.println("How are you doing?");
		ans=sc.next();
		System.out.println("Enter your name");
		name=sc.next();
		System.out.println("Hello"+" "+name);
		System.out.println("Enter your account type");
		accountType=sc.next();
		System.out.println("Enter your username");
		userName=sc.next();
		System.out.println("Enter your password");
		password=sc.next();
		if(obj.authenticate(userName,password)) {
			System.out.println("Welcome to Home page");
			do {
				System.out.println("Manu");
				System.out.println("1. Check Balance");
				System.out.println("Enter 1 for checking balance");
				choice=sc.nextInt();
				switch(choice) {
				case 1: 
					if(accountType.equalsIgnoreCase("Personal")) {
						PersonalAccount personalObj=new PersonalAccount(account,pass,bal,accountPersonal,accountPersonalPass,personalBal);
						System.out.println(personalObj.getBalance(userName, password));
						personalDetailsObj.displayAddress(userName);
						
					}else if(accountType.equalsIgnoreCase("business")){
						BusinessAccount businessObj=new BusinessAccount(account,pass,bal,accountBusiness,accountBusinessPass,businessBal);
						System.out.println(businessObj.getBalance(userName, password));
						personalDetailsObj.displayAddress(userName);
					}
					
					
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
