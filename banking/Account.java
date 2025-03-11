package banking;

abstract class Account {

	String accountHolderName;
	String accountNumber;
	double balance;

	public Account(String accountHolderName, String accountNumber, double balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;

	}
	
	abstract void deposit(double amount);
	

//	public void deposit(double amount) {
//		balance = balance + amount;
//	}
//	
//	public void withdraw(double amount) {
//		if(balance >= amount) {
//			balance = balance - amount;
//		}else {
//			System.out.println("Insufficient Balance");
//		}
//	}

}
