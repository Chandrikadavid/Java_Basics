package abstractLesson;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal dog = new Dog();
		Animal giraffe = new Giraffe();
		
		dog.bark();
		giraffe.bark();
		
		dog.eat();
		giraffe.rest();
	}

}
