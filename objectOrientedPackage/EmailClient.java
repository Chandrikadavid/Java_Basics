package objectOrientedPackage;

public class EmailClient {
	String emailProvider = "gmail";
	String userEmail = "david@gmail.com";
	String userEmailPassword = "daivd@123";
	
	public EmailClient(String eprovider,String email,String epassword) {
		this.emailProvider = eprovider;
		this.userEmail = email;
		this.userEmailPassword = epassword;
	}
	
}
