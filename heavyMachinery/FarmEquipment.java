package heavyMachinery;

abstract class FarmEquipment {

	String equipmentName;
	String equipmentModel;

	public FarmEquipment(String equipmentName, String equipmentModel) {
		this.equipmentName = equipmentName;
		this.equipmentModel = equipmentModel;
	}

	abstract void startEquipment();

	abstract void displayEqipmentDetails();
}
