package OperatorsLesson;

public class UnaryTest {

	public static void main(String[] args) {
		
	// +a, a++, ++a, a-, a--, --a, ! (logical compliment)
		
		int a = 10;
		System.out.println("unary plus: "+ +a);
		
		int b = -10;
		System.out.println("Post Increment: "+ b++); //-10
		System.out.println("After Post Increment b value is: "+ b); //-9
		System.out.println("Pre Increment: "+ ++b); //-8
		
		int c = -10;
		System.out.println("Post Decrement: "+ c--); //-10
		System.out.println("After Post Decrement c value is: "+ c); //-11
		System.out.println("Pre Decrement: "+ --c + c); //-12
		
		boolean bool= true;
		System.out.printf("Logical Compliment Operator:"+ !bool);

	}

}
