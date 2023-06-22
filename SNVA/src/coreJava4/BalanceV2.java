package coreJava4;

public class BalanceV2 extends AuthenticatorV2{
	double[] bal;
	public BalanceV2(String userName, String password, String[] userNameArr, String[] passwordArr,double[] bal,String name,String ans) {
		super(userNameArr,passwordArr,userName,password,name,ans);
		this.bal=bal;
	}
	public double getBalance(String userName) {
		int index=-1;
		for(int i=0;i<userNameArr.length;i++) {
			if(userNameArr[i].equals(userName)) {
				index=i;
				break;
			}
		}
		if(index==-1) {
			System.out.println("Invalid username");
		}
		System.out.println(name+" "+"Your balance is"+" "+bal[index]);
		return bal[index];
	}
	

}
