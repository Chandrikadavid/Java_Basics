package heavyMachinery;

public class Tractor extends FarmEquipment{

	 int enginePower;

	public Tractor(String equipmentName, String equipmentModel, int enginePower) {
		super(equipmentName, equipmentModel);
		this.enginePower = enginePower;
		
	}

	@Override
	void startEquipment() {
		System.out.println(equipmentName + "[" + equipmentModel + "]" + "is starting");
	}

	@Override
	void displayEqipmentDetails() {
		System.out.println("Tractor Model: " + equipmentModel);
		System.out.println("Engine Power: " + enginePower);
	}

}
