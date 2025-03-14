// Guesser.java //

import java.util.*;
import java.util.Random;
import java.util.Scanner;


public class Guesser {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		while (true) {
			System.out.println("0) Exit");
			System.out.println("1) Human Guesser");
			System.out.println("2) Computer Guesser");
			System.out.println("Please enter 0-2: ");
			response = input.nextLine();
			System.out.println(response);
			
			if (response == "0");
				break;
		} // end while

	} // end static void

	public void humanGuesser(){
		int target = random.nextInt(100) + 1;
		int attempts = 0;
		System.out.println("Human Guesser");

		while (true) {
			System.out.print((attempts + 1) + ") Please enter a number: ");
            		int guess = scanner.nextInt();
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


	private int getMean(int lower, int upper){
		int mean = (int)((lower + upper)/2);
		return mean;

	} // end getMean

	public void computerGuesser(){
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
			response = input.nextLine();
		} // end while	

	} // computerGuesser
} // end class Guesser
