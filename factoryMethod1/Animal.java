package factoryMethod1;

import factoryMethod2.Giraffe;

public class Animal {

	String name;
	private Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	
	public static Dog createDog(String name) {
		return new Dog(name);
	}

	public static Giraffe createGiraffe(String name) {
		return new Giraffe(name);
	}
}
