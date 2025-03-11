package realWorldProblems;

public class BigUtilityVehicle implements Vehicle {

	private boolean electric;
	private String bigUtilityVehicle;
	
	public BigUtilityVehicle(String bigUtilityVehicle, boolean electric) {
		this.bigUtilityVehicle = bigUtilityVehicle;
		this.electric = electric;
	}

	@Override
	public void pickUpPassenger(String passenger) {

		System.out.println("Picking up " + passenger + " in " + bigUtilityVehicle);
	}

	@Override
	public void driveToLocation(String location) {
		System.out.println("Drive to the location " + location + " in " + bigUtilityVehicle);
	}

	@Override
	public int getNumberOfWheels() {
		return 8;
	}

	@Override
	public boolean isElectric() {
		return electric;
	}

}
