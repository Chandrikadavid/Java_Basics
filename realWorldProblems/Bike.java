package realWorldProblems;

public class Bike implements Vehicle {

	private boolean electric;
	private String bikeModel;
	
	public Bike(String bikeModel, boolean electric) {
		this.bikeModel = bikeModel;
		this.electric = electric;
	}

	@Override
	public void pickUpPassenger(String passenger) {

		System.out.println("Picking up " + passenger + " in " + bikeModel);
	}

	@Override
	public void driveToLocation(String location) {
		System.out.println("Drive to the location " + location + " in " + bikeModel);
	}

	@Override
	public int getNumberOfWheels() {
		return 2;
	}

	@Override
	public boolean isElectric() {
		return electric;
	}

}
