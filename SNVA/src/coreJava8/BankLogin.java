package coreJava8;

public interface BankLogin {
	public boolean verify(String accountNo, String password);
	public boolean addUser(User user);

}
