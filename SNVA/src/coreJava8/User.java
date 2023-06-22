package coreJava8;
import java.util.*;

public class User implements BankLogin {
	String[] account;
	String[] pass;
	double[] bal;
	String accountNo;
	String password;
	String[] doorNo;
	String[] streetNo;
	String[]locality;
	String[] zipCode;
	 String[] mobileNumber;
	 String[] telephoneNumber;
	public User(String[] account, String[] pass,double[] bal, String[] doorNo, String[] streetNo, String[]locality, String[] zipCode, String[] mobileNumber,  String[] telephoneNumber) {
		this.account=account;
		this.pass=pass;
		this.bal=bal;
	}
	
	public boolean verify(String accountNo, String password) {
		this.accountNo=accountNo;
		this.password=password;
		int index=-1;
		for(int i=0;i<account.length;i++) {
			if(account[i].equals(accountNo) && pass[i].equals(password)) {
				index=i;
				break;
			}
		}
		
		return index!=-1?true:false;
	}
	public double checkBalance(String userName) {
		double balance=0;
		for(int i=0;i<account.length;i++) {
			if(userName.equals(account[i])) {
				balance=bal[i];
				break;
			}
		}
		return balance;
		
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}
public void displayAddress(String accountnum) {
	for(int i=0;i<account.length;i++) {
		if(account[i].equals(accountnum)) {
			System.out.println(doorNo[i]);
			System.out.println(streetNo[i]);
			System.out.println(locality[i]);
			System.out.println(zipCode[i]);
			System.out.println(mobileNumber[i]);
			System.out.println(telephoneNumber[i]);
		}
	}
}
	
}
