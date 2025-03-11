package exceptionTest;

public class SampleBankTransfer {

	public static void main(String[] args) {
		
	}
	
	public static void transferFunds(String fromAccount, String toAccount, double amount) {
		
		if(fromAccount == null || toAccount == null) {
			System.out.println("Add some money to account");
		}
		
		double balance = getAccountBalance(fromAccount);
		
		if(balance < amount) {
			System.out.println("Insuficient Balance");
		}
	}
	
	public static double getAccountBalance(String accountNumber) {
		double currentBalance = 2000;
		return currentBalance;
	}

}
