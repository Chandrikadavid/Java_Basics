package realWorldProblems;

public class RunnerClass {

	public static void main(String[] args) {

//		Vehicle vehicle = new Car("Tata", true);
//		
//		vehicle.pickUpPassenger("John");
//		vehicle.driveToLocation("Pune");
//		System.out.println("It is a " + vehicle.getNumberOfWheels() + " Wheeler");
//		System.out.println("Electric: " + vehicle.isElectric());
//		System.out.println("Vehicle type is: " + vehicle.getClass());
		
		
		Vehicle[] vehicles = {
				new Car("Tesla",true),
				new Bike("Tesla",true),
				new BigUtilityVehicle("Mahindra",false)
		};
		
		for (Vehicle arr : vehicles) {
			arr.pickUpPassenger("John");
			arr.driveToLocation("Hyd");
			System.out.println("It is a " + arr.getNumberOfWheels() + " Wheeler");
			System.out.println("Electric: " + arr.isElectric());
			System.out.println("Vehicle type is: " + arr.getClass());
			System.out.println("---------------------------");
		}
		
	}

}
