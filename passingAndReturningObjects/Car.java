package passingAndReturningObjects;

public class Car {
	String make;
	int year;
	
	public Car(String make,int year) {
		this.make = make;
		this.year = year;
	}
	public void display() {
		System.out.println("Make: "+ make+", "+ " Year: "+year);
	}


}
