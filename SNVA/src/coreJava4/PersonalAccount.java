package coreJava4;

public class PersonalAccount extends BankAcountTask3 {
	double balance;
	String[] userName;
	String[] passwordArr;
	double[] balArr;
	
	public PersonalAccount(String[] accountNumber, String[] password,double[] balance,String[] userName,String[] pass,double[]bal) {
		super(accountNumber, password,balance);
		this.userName=userName;
		this.passwordArr=pass;
		this.balArr=bal;
		
	}
	public double getBalance(String userName, String pass) {
		int index=-1;
		System.out.println("Personal Account balance");
    	for(int i=0;i<this.userName.length;i++) {
    		if(this.userName[i].equals(userName)) {
    			index=i;
    			this.balance=balArr[index];
    			break;
    		}
    	}
    	return balance;
		
	}

}
