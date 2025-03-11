package multiLevelInheritance;

public class Shirt extends Clothing{
	
	String size;
	
	Shirt(String name, double price, String color, String size) {
		super(name, price, color);	
		this.size = size;
	}
	
	 void displaySize() {
		System.out.println("Size from Child itself is: " + size);

	}

}
