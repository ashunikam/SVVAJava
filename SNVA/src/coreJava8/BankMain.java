package coreJava8;
import java.util.*;




public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice=0;
		String ans="";
		String accountNo="";
		String password="";
		User user;
		ManagerVerification managerVerify;
		Scanner sc=new Scanner(System.in);
		String[] managerAccount= {"AB001","AB002"};
		String[] managerPassword= {"123abc","12bng"};
		String[] account= {"AB003","AB004","AB005"};
		String[] pass= {"45trt","987bvn","wer5"};
		String[] doorNo = {"1", "2", "3"};
		String[] streetNo = {"Street 1", "Street 2", "Street 3"};
		String[] locality = {"Locality 1", "Locality 2", "Locality 3"};
		String[] zipCode = {"12345", "23456", "34567"};
		String[] mobileNumber = {"1234567890", "2345678901", "3456789012"};
		String[] telephoneNumber = {"1111111111", "2222222222", "3333333333"};
		double[] bal= {100,200,300,400,500};
		do {
			System.out.println("1.User");
			System.out.println("2. Manager");
			System.out.println("Enter choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				user=new User(account, pass,bal,doorNo,streetNo,locality,zipCode, mobileNumber, telephoneNumber);
				System.out.println("Enter Username and password");
				accountNo=sc.next();
				password=sc.next();

				if(user.verify(accountNo, password)) {
					System.out.println("Log in successfully");
					user.displayAddress(accountNo);
				}
				
				else {
					System.out.println("Enterd wrong creadentials");
				}
				do {
					System.out.println("Menu");
					System.out.println("1.Display Balance");
					System.out.println("Enter choice");
					choice=sc.nextInt();
					switch(choice) {
					case 1:
						double balance=user.checkBalance(accountNo);
						System.out.println("Your account balance is"+balance);
						break;
					}
					
				}while(ans.equals("Y")||ans.equals("y"));
				break;
			case 2:
				System.out.println("Enter account number and password");
				accountNo=sc.next();
				password=sc.next();
				managerVerify=new ManagerVerification(managerAccount, managerPassword);
				if(managerVerify.verify(accountNo, password)) {
					System.out.println("Log in successfully");
					
				}
				
				else {
					System.out.println("Entered wrong creadentials");
				}
				
				break;
			}
			System.out.println("Want to continue ?");
			ans=sc.next();
		}while(ans.equals("y")||ans.equals("Y"));

	}
}

