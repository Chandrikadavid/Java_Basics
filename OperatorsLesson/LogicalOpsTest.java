package OperatorsLesson;

public class LogicalOpsTest {

	// && (AND), ||(OR) , !(NOT), ^(XOR)
	public static void main(String[] args) {

				int ticketPrice = 150;
		int jeansPrice = 8000;
		
		int budget = 1000;
		
		afford(ticketPrice, budget, jeansPrice);
		
		// Check if you can afford both items
//		if (ticketPrice + jeansPrice <= budget) {
//			System.out.println("You can afford both the ticket and the jeans.");
//		} else if (ticketPrice <= budget || jeansPrice <= budget) {
//			System.out.println("You can afford either the ticket or the jeans, but not both.");
//		} else {
//			System.out.println("You can't afford either the ticket or the jeans.");
//		}

	}
	public static void afford(int ticket, int budget, int jeans) {
		int ticketPrice = 150;
		int jeansCost = 8000;
		int budget1 = 1000;
		
		int totalCost = ticketPrice + jeansCost;
 
		boolean canYouBuyMovieTicket = budget1 >= ticketPrice;// true
		System.out.println("Movie ticket eligibility:" + canYouBuyMovieTicket);
 
		boolean canYouBuyJeans = budget1 >= jeansCost;// true
		System.out.println("Jeans eligibility:" + canYouBuyJeans);
 
		boolean canYouBuyBoth = budget1 >= totalCost;
		System.out.println("Both Movie ticket and Jeans can be purchased.");
 
		if (canYouBuyBoth) {
			System.out.println("Both Movie ticket and Jeans can be purchased.");
		} else if (canYouBuyMovieTicket && canYouBuyJeans) {
			System.out.println("you can afford both movie and jeans.");
		} else if (canYouBuyMovieTicket || canYouBuyJeans) {
			if (canYouBuyMovieTicket) {
				System.out.println("You can afford movie.");
			}
			if (canYouBuyJeans) {
				System.out.println("You can afford Jeans.");
			}
		}
		if (canYouBuyJeans && !canYouBuyMovieTicket) {
			System.out.println("you can buy jeans only.");
		}
		if (!canYouBuyJeans && canYouBuyMovieTicket) {
			System.out.println("you can buy Movie ticket only.");
		}
 
	}
}
