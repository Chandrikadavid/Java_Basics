package heavyMachinery;

public class Harvestor extends Tractor {

	double harvestingCapacity;

	public Harvestor(String equipmentName, String equipmentModel, int enginePower, double harvestingCapacity) {
		super(equipmentName, equipmentModel, enginePower);
		this.harvestingCapacity = harvestingCapacity;

	}

	void startEquipment() {
		super.startEquipment();
	}
	
	void displayEquipmentDetails() {
		super.displayEqipmentDetails();
		System.out.println("Harvesting Capacity: " + harvestingCapacity + " acres per hour");
	}
	public void startHarvesting() {
		System.out.println(equipmentName + "[" + equipmentModel + "]" + "started harvesting");
	}

	public void endHarvesting() {
		// TODO Auto-generated method stub
		
	}
}
