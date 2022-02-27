import java.util.Scanner;

public class BeverageSelector {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("So you'd like a drink, Well I've got options.\n" 
							+"Here is a list of what I've got!\n" 
							+ "1 : Water\n" + "2 : Coke\n" + "3 : Cofefe"); 
							//the spelling of coffee is a joke that I think is funny
		int drinkChoice;
		drinkChoice = in.nextInt();
		switch (drinkChoice){
			case 1 : System.out.print("You chose water, Good job making the healthy choice");
			
			case 2 : System.out.print("you chose coke, make sure to brush your teeth tonight");
			
			case 3 : System.out.print("Oh Yuck I can't believe you chose coffee, Well here you are");
		}
		
	}

}
