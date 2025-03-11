package banking;

public class FixedDepositAccount extends SavingsAccount {

	int depositTerm;

	public FixedDepositAccount(String accountHolderName, String accountNumber, double balance, double intrestRate,
			int depositTerm) {
		super(accountHolderName, accountNumber, balance, intrestRate);
		this.depositTerm = depositTerm;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance = balance - amount;
		} else {
			System.out.println("Insufficient Balance");
		}
	}
	
	public void displayAccDetails() {
		super.displayAccountDetails();
		double totalBalanceWithfd = balance + fdMaturityAmt();
		System.out.println("I have an FD too with term of " + depositTerm + " months");
		System.out.println("Total amount with FD is: " + totalBalanceWithfd );
	}
	
	public double fdMaturityAmt() {
		double maturedAmt = balance * (intrestRate/100) * depositTerm/12;
		System.out.println("Log info: FD matured amount is " + maturedAmt);
		return maturedAmt;
	}

}
