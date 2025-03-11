package movieTicketHall;
 
public class MovieHallTest {
	static String seatNumber = null;
 
	public static void main(String[] args) {
		int[] ticketPrice = { -1, 250, 46, 79, 300 };
 
		int age = 40;
		for (int i = 0; i < ticketPrice.length; i++) {
			if (isSeatBooked(ticketPrice[i]) == true) {
				System.out.println("**********************************************************");
				System.out.println("Seat Number is: " + seatNumber);
				if (isMovieWatched() == true) {
					System.out.println(seatNumber);
					if (checkGiftEligibilty(age) == true) {
 
						System.out.println("Eligible for Gift");
					} else {
						System.out.println("Not Eligible");
						System.out.println("**********************************************************");
					}
					
				}
			}
 
		}
	}
 
	public static boolean isSeatBooked(int ticketPrice) {
		System.out.println("Remainder= " + ticketPrice%250);
		if (ticketPrice%250 == 0) {
			seatNumber = "A3";
			return true;
		} else if (ticketPrice < 250) {
			return false;
		} else {
			return false;
		}
	}
 
	public static boolean checkGiftEligibilty(int age) {
		System.out.println("Age is: " + age);
		if (age == 50) {
			return true;
		} else if (age < 50 || age > 50) {
			return false;
		} else {
			return false;
		}
	}
 
	public static boolean isMovieWatched() {
		if (seatNumber != null) {
			return true;
		} else if (seatNumber == null) {
			return false;
		} else {
			return false;
		}
	}
 
}