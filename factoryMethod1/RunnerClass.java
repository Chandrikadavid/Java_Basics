package factoryMethod1;

import factoryMethod2.Giraffe;

public class RunnerClass {

	public static void main(String[] args) {

		Dog dog = Animal.createDog("ABC Dog");
		Giraffe giraffe = Animal.createGiraffe("ABC Giraffe");
		
		dog.getDogName();		
	}

}
