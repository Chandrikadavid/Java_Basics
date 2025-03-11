package multiLevelInheritance;

public class Clothing extends Product {
	
	String color;
	
	
	Clothing(String name, double price, String color) {
		super(name, price);
		this.color = color;
	}
	
	void displayColor() {
		System.out.println("Color from Parent is: " + color);
	}
}
