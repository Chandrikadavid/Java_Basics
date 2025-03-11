package passingAndReturningObjects;

public class CarRunner {

	public static void main(String[] args) {
	
		Car myCar = new Car("Tesla", 2000);
		printCarDetails(myCar);

	}
	public static void printCarDetails(Car car) {
		car.display();
		}

}
