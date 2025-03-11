package superKeyword;

public class Giraffe extends Animal {

	public Giraffe(String name) {
		super(name);
	}

	void bark() {
		super.bark();
		System.out.println("Giraffe is on mute");
	}

}
