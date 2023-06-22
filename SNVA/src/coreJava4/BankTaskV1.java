package coreJava4;

public class BankTaskV1 {
	String[] accountId;
	String[] passowrd;
	double[] balance;
	public BankTaskV1(String[] account,String[] pass, double[] bal){
		this.accountId=account;
		this.passowrd=pass;
		this.balance=bal;
	}
	public double getBalance(String id) {
		int index=0;
		for(int i=0;i<accountId.length;i++) {
			if(accountId[i].equals(id)) {
				index=i;
				break;
			}
		}
		return balance[index];
	}
	public boolean checkCredentials(String userName,String password) {
		int index=-1;
		for(int i=0;i<accountId.length;i++) {
			if(accountId[i].equals(userName)) {
				index=i;
				break;
			}
		}
		
		return passowrd[index].equals(password);
	}
}
