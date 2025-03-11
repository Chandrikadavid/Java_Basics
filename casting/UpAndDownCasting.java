package casting;

public class UpAndDownCasting {
public static void main(String[] args) {
		
		// Implicit casting - up
		Animal animal = new Dog();
		animal.makeSound();
		
		//Explicit casting - down
		Dog myDog = (Dog)animal;
		myDog.run();
 
	}
}
