package package1;

public class Animal {

	String defaultName = "DefaultName";
	public String publicName = "PublicName";
	private String privateName = "PrivateName";
	protected String protectedName = "ProtectedName";

	void defaultPrint() {
		System.out.println("I am inside Animal Class Package1: " + defaultName);
	}

	public void publicPrint() {
		System.out.println("I am inside Animal Class Package1: " + publicName);
	}

	protected void privatePrint() {
		System.out.println("I am inside Animal Class Package1: " + privateName);
	}

	protected void protectedPrint() {
		System.out.println("I am inside Animal Class Package1: " + protectedName);
	}
}
