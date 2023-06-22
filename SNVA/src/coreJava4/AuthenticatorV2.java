package coreJava4;

class AuthenticatorV2 extends ChatBotV2 {
	protected String userName;
	protected String password;
	protected String[] userNameArr;
	protected String[] passwordArr;
	
	public AuthenticatorV2(String[] userNameArr2, String[] passwordArr2, String userName2, String password2,String name,String ans) {
		// TODO Auto-generated constructor stub
		super(name, ans);
		this.userNameArr=userNameArr2;
		this.passwordArr=passwordArr2;
		this.userName=userName2;
		this.password=password2;
		
	}
	public String getUserName() {
		return this.userName;
	}
	public String getPassword() {
		return this.password;
	}
	public boolean isAuthenticate(String userName, String password ){
		int index=-1;
		for(int i=0;i<userNameArr.length;i++) {
			if(userNameArr[i].equals(userName)) {
				index=i;
				break;
			}
		}
		if(index==-1) {
			System.out.println("You have entered invalid username");
		}
		return passwordArr[index].equals(password);
	}

}
