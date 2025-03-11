package package1;

public class Giraffe extends Animal{
	private String publicName2;
	
	public static void main(String[] args) {
		
	}
	public void accessible() {
		String defaultName1 = defaultName;
		String protectesName1 = protectedName;
		publicName2 = publicName;
		defaultPrint();
		protectedPrint();
		publicPrint();
	}
	public void notAccessible() {
		private Print();
		private Name;
	}
}
/**
 * public > protected > default > private(least accessibility)
 * 
 * 
 */
