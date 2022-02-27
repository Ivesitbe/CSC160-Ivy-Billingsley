import java.util.Scanner;

public class Accumulator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int startChoice = 0;
		
		System.out.print("Enter numbners and then enter 0 to get the sum");
		startChoice = in.nextInt();
		
		int numChoice;
		int sumOfChoice = 0;
		int finalSum = 0;
		do {
			do{
				System.out.print("Please pick some numbers");
				numChoice = in.nextInt();
				sumOfChoice = numChoice;
				finalSum = finalSum + sumOfChoice;
			}while(sumOfChoice != 0);
			
			System.out.print(finalSum 
					+ " Is your final sum \n"
					+ "Would you like to add again? if so please input 1 for yes a 2 for no");
			
			startChoice = in.nextInt();
			
		}while(startChoice != 2);
		
	}
}
