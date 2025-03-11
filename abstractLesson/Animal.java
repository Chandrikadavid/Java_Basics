package abstractLesson;

abstract class Animal {

	public Animal() {
		System.out.println("I am a Animals class constructor");
	}

	void Run() {
		System.out.println("Abstract class animal is running");
	}

	abstract void bark();

	abstract void eat();

	abstract void rest();
}
