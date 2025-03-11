package privateConstructor2;

import privateConstructor.Animal;

public class Giraffe extends Animal {

	protected Giraffe(String name) {
		super(name);
		System.out.println("Girafee constructor");
	}

	@Override
	public void makeSound() {
		System.out.println("Giraffe is on mute");
	}

}
