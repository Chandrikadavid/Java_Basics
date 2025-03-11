package banking;

public class SavingsAccount extends Account {

	double intrestRate;

	public SavingsAccount(String accountHolderName, String accountNumber, double balance, double intrestRate) {
		super(accountHolderName, accountNumber, balance);
		this.intrestRate = intrestRate;
	}
	
	public double calculateIntrest() {
		
		double intrestIs = balance * (intrestRate/100);
		return intrestIs;
	}
	
	public void displayAccDetails() {
		double totalBalanceWithIntrest = balance + calculateIntrest();
		
		System.out.println("Account Holder: " + accountHolderName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Balance: " + balance + totalBalanceWithIntrest);
		System.out.println("Intrest Rate : "+ intrestRate + "%");
	}

	public void displayAccountDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		
	}

}
