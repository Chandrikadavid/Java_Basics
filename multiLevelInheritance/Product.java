package multiLevelInheritance;

public class Product {
	String name;
	double price;

	Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	void displayInfo() {
		System.out.println("Product name is: " + name);
		System.out.println("Product price is: " + price);
	}
}