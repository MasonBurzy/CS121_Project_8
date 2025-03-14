// Guesser.java //

import java.util.Random;
import java.util.Scanner;


public class Guesser {
	private static final Scanner scanner = new Scanner(System.in);
	private static final Random random = new Random();

	public static void main(String[] args) {
		while (true) {
			System.out.println("0) Exit");
			System.out.println("1) Human Guesser");
			System.out.println("2) Computer Guesser");
			System.out.println("Please enter 0-2: ");

			String response = scanner.nextLine();
			System.out.println(response);
			
			if (response.equals( "0")) {
				break;
			} else if (response.equals("1")) {
				humanGuesser();
			} else if (response.equals("2")) {
				computerGuesser();
			} else {
				System.out.println("Invalid choice. Try again.");
			}

		} // end while

		scanner.close();
	
	} // end void

	public static void humanGuesser(){
		int target = random.nextInt(100) + 1;
		int attempts = 0;
		System.out.println("Human Guesser");

		while (true) {
			System.out.print((attempts + 1) + ") Please enter a number: ");
            		int guess = scanner.nextInt();
            		scanner.nextLine();
			attempts++;
            
            		if (guess < target) {
                		System.out.println("too low...");
            		} else if (guess > target) {
                		System.out.println("too high...");
            		} else {
                		System.out.println("got it!\n\nVery good!");
                		break;
			}

        	} // end while
	
	} // end humanGuesser


	private static int getMean(int lower, int upper){
		int mean = (int)((lower + upper)/2);
		return mean;

	} // end getMean

	public static void computerGuesser(){
		int lower = 1;
		int upper = 100;
		int guess = getMean(lower, upper);
		String response = "";
		int turns = 0;

		boolean keepGoing = true;
		while (keepGoing){
			turns++;

			System.out.println(turns + ") I guess " + guess);
			System.out.print("Too (H)igh, too (L)ow, or (C)orrect");
			response = scanner.nextLine().toLowerCase();

			if (response.equals("h")) {
				upper = guess -1;
				guess = getMean(lower, upper);
			} else if (response,equals("l")) {
				lower = guess +1;
				guess = getMean(lower, upper);
			} else if (response.equals("c")) {
				System.out.println("Yay! The computer guessed your number")
		} // end while	

	} // computerGuesser
} // end class Guesser
