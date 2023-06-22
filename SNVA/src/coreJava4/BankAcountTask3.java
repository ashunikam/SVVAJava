package coreJava4;

public class BankAcountTask3 {
        protected String[] accountNumber;
        
        protected String[] password;
        protected double[] balanceArr;

        public BankAcountTask3(String[] accountNumber,String[] password,double[] bal) {
            this.accountNumber = accountNumber;
            this.password = password;
            this.balanceArr=bal;
          
        }

        

        public boolean authenticate(String number, String password) {
        	int index=-1;
        	for(int i=0;i<this.accountNumber.length;i++) {
        		if(accountNumber[i].equals(number)) {
        			index=i;
        		}
        	}
            return this.password[index].equals(password);
        }
        public double getBalance(String userName,String password) {
        	int index=-1;
        	for(int i=0;i<this.accountNumber.length;i++) {
        		if(accountNumber[i].equals(userName)) {
        			index=i;
        			break;
        		}
        	}
        	return this.balanceArr[index];
        }


}