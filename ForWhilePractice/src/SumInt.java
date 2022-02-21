import java.util.Scanner;

public class SumInt {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numChoice = 0;
		int continueChoice = 2;
		int counterTile = 0;
		
		
		System.out.println("Would you like to play the Factoring game?\n" 
							+ "please type 2 for yes and 1 for no");
		
		continueChoice = in.nextInt();
		do {
			System.out.println("So you want to play a game?\n" + "well now give us a number\n");
			numChoice = in.nextInt();
			counterTile = numChoice;
			int sum = 0;
			
			if (numChoice > 0) {
				int i = 0;
				
				
				while(i <= numChoice) {
					sum = sum + counterTile;
					counterTile = counterTile - 1;
					i++;
				}
			}
			System.out.println("The factor is " + sum);
			sum = 0;
			System.out.print("please press 2 to do it again!");
			continueChoice = in.nextInt();
		}while (continueChoice != 1);
	}

}
