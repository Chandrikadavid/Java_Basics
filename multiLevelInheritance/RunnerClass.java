package multiLevelInheritance;

public class RunnerClass {

	public static void main(String[] args) {
		
		Shirt shirt1 = new Shirt("Rare Rabbit", 2999.99, "Pink", "XL");
		
		shirt1.displayInfo();
		shirt1.displayColor();
		shirt1.displaySize();
		
	}

}
