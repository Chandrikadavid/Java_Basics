package objectOrientedPackage;

public class DiscountRunnerTest {

	public static void main(String[] args) {
		
		Website w1 = new Website();
		w1.provideDiscount();
		
		NoDiscountWebsite w2 = new NoDiscountWebsite();
		w2.provideDiscount();
		
		AmazonWebsite w3 = new AmazonWebsite();
		//w3.provideDiscount();
		w3.greet();

	}

}
