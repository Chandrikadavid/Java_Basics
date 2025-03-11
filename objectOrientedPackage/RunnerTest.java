package objectOrientedPackage;

public class RunnerTest {

	public static void main(String[] args) {
		
//		Animals animals = new Animals();
//		animals.fly();
//		
//		animals.bark();
		
		/**
		 * Cars Parameterized Constructor
		 */
		
//		Cars cars1 = new Cars("Toyota",1990);
//		Cars cars2 = new Cars("BMW", 2024);
//		Cars cars3 = new Cars("Tesla",1986);
//		
//		System.out.println("Model:"+ cars1.model +"  "+ "\nYear: " + cars1.year);
//		System.out.println("Model:"+ cars2.model +"  "+ "\nYear: " + cars2.year);
//		System.out.println("Model:"+ cars3.model +"  "+ "\nYear: " + cars3.year);
		
		/**
		 * Cars Default Constructor
		 */
//		Cars car = new Cars();
//		System.out.println(car.model + car.year );
		
		/**
		 * EmailClient Parameterized Constructor
		 */
		
		EmailClient emailClient1 = new EmailClient("Yahoo", "john@yahoo.com", "john123");
		EmailClient emailClient2 = new EmailClient("gmail", "john@gmail.com", "john546");
		EmailClient emailClient3 = new EmailClient("outlook", "john@outlook.com", "john678");
		
		System.out.println("Email Provider is: "+ emailClient1.emailProvider+ "\nUser Email: " + emailClient1.userEmail + "\nUser Password: " + emailClient1.userEmailPassword);
		System.out.println("*************");
		System.out.println("Email Provider is: "+ emailClient2.emailProvider+ "\nUser Email: " + emailClient2.userEmail + "\nUser Password: " + emailClient2.userEmailPassword);
		System.out.println("*************");
		System.out.println("Email Provider is :"+ emailClient3.emailProvider+ "\nUser Email: " + emailClient3.userEmail + "\nUser Password: " + emailClient3.userEmailPassword);
	}

}
