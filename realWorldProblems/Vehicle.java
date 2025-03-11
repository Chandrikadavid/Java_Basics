package realWorldProblems;

interface  Vehicle {
	
	void pickUpPassenger(String passenger);
	void driveToLocation(String toLocation);
	int getNumberOfWheels();
	
	boolean isElectric();
}
