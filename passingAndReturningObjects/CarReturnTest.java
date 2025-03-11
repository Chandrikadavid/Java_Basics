package passingAndReturningObjects;

public class CarReturnTest {

	public static void main(String[] args) {
		createCar("Toyota", 2024).display();
		createCar("BMW", 1998).display();
		createCar("Tata", 2000).display();
		
	}
	public static Car createCar(String make, int year) {
		Car car = new Car(make,year );
		return car;
	}

}
