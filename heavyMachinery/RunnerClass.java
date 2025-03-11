package heavyMachinery;

public class RunnerClass {

	public static void main(String[] args) {

		Harvestor harvestor = new Harvestor("Harvetor101", "Eicher Harvestor",150 , 3.67);
		
		harvestor.startEquipment();
		harvestor.displayEquipmentDetails();
		harvestor.startHarvesting();
		harvestor.endHarvesting();
	}

}
