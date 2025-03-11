package banking;

public class RunnerClass {

	public static void main(String[] args) {
		
		FixedDepositAccount fd = new FixedDepositAccount("John", "13343654", 30000, 10, 3);
		
		System.out.println("----------Before Deposit----------");
		fd.displayAccDetails();
		
		System.out.println("-------------After Deposit-------");
		fd.deposit(10000);
		fd.displayAccDetails();
		
		
	}

}
