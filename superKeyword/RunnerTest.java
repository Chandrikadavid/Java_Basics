package superKeyword;

public class RunnerTest {

	public static void main(String[] args) {

		Dog dog = new Dog("Doggy");
		Giraffe giraffe = new Giraffe("Leo");
		
		dog.bark();
		System.out.println(dog.name + " is the name of the Dog");
		giraffe.bark();
		System.out.println(giraffe.name + " is the name of the Giraffe");
	}

}
