package coreJava8;

import java.util.Scanner;

public class ManagerVerification implements BankLogin{
	String accountNo;
	String password;
	String[] account;
	String[] pass;
	public ManagerVerification(String[] account, String[] pass) {
		this.account=account;
		this.pass=pass;
		
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
	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}
}
