package privateConstructor;

public abstract class Animal {
	
	String name;
	/**
	 * 
	 * When Protected-->accessible to clss within pac
	 * and also outside the pac when extends is used
	 * 
	 * 
	 * When default--->accessible to clss within pac
	 * @param name
	 */
	  protected Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void makeSound();
}
