import java.util.Random;
import java.util.Scanner;

public class GuessMyNumberGame {
	
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		Random rand = new Random();
		int upperbound = 101;
		int int_random = rand.nextInt(upperbound);
		
		// - A test to see if my random number generator is working. It did.
		//System.out.println(int_random);
		
		System.out.println("plese guess a number between 0 and 100");
		int guessedNum = in.nextInt();
		
		System.out.println("you picked " + guessedNum);
		
		System.out.println("the number was " + int_random);
		System.out.println("your were "+ (int_random - guessedNum) + " off");
	
	}
}
