package realWorldProblems;

public class Car implements Vehicle {

	private boolean electric;
	private String carModel;
	
	public Car(String carModel, boolean electric) {
		this.carModel = carModel;
		this.electric = electric;
	}

	@Override
	public void pickUpPassenger(String passenger) {

		System.out.println("Picking up " + passenger + " in " + carModel);
	}

	@Override
	public void driveToLocation(String location) {
		System.out.println("Drive to the location " + location + " in " + carModel);
	}

	@Override
	public int getNumberOfWheels() {
		return 4;
	}

	@Override
	public boolean isElectric() {
		return electric;
	}

}
