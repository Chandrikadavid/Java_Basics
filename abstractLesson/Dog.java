package abstractLesson;

public class Dog extends Animal {

	@Override
	void bark() {
		System.out.println("Dog as a child has implemented the bark method: Woof");

	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog as a child has implemented the eat method");
		
	}

	@Override
	void rest() {
		// TODO Auto-generated method stub
		System.out.println("Dog as a child has implemented the rest method");
	}

}
