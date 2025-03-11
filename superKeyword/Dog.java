package superKeyword;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	void bark() {
		super.bark();
		System.out.println("Dogs are barking from Child Class");
	}

}
