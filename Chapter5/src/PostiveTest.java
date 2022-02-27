import java.util.Scanner;

public class PostiveTest {
	public static int isPositive(){
		Scanner in = new Scanner(System.in);
		int value;
		
		System.out.println("Please select a vlaue\n");
		value = in.nextInt();
		
		if(value >= 0) {
			System.out.println("the number is positive\n");
			
		}else {
			System.out.println("the number is negative\n");
		}
		
		return 0;
	}

	public static int greatestValue() {
		Scanner in = new Scanner(System.in);
		int value1;
		int value2;
		int value3;
		System.out.println("please put in 3 numbers\n");
		value1 = in.nextInt();
		System.out.println("Number Confirmed\n");
		value2 = in.nextInt();
		System.out.println("Number Confirmed\n");
		value3 = in.nextInt();
		System.out.println("Number Confirmed\n");
		
		if(value1 > value2 && value1 > value3) {
			System.out.println(value1 + " is the greatest value");
		}else if(value2 > value1 && value2 > value3) {
			System.out.println(value2 + " is the greatest value");
		}else {
			System.out.println(value3 + " is the greatest value");
		}
		return 0;
	}
	public static int smallLargeTest() {
		Scanner in = new Scanner(System.in);
		
		double inValue = 0.0;
		
		System.out.println("Please pick a number as small or as big as you want\n" 
				+ "for example .003 or 46,000,000\n");
		inValue = in.nextDouble();
		System.out.println("Number confirmed your number is " + inValue + "\n");
		inValue = Math.abs(inValue);
		if (inValue < 1) {
			System.out.println("your number is small\n");
		}else if (inValue >= 1000000) {
			System.out.println("your number is large\n");
		}
			
		
		return 0;
	}
	
public static int weekDay() {
	Scanner in = new Scanner(System.in);
	int weekNum;
	System.out.println("enter a number between 1 and 7 to pick a day\n");
	weekNum = in.nextInt();
	switch (weekNum) {
		case 1 : 
			System.out.println("That day is Sunday\n");
			System.exit(0);
		case 2 : 
			System.out.println("That day is Monday\n");
			System.exit(0);
		case 3 : 
			System.out.println("That day is Tuesday\n");
			System.exit(0);
		case 4 : 
			System.out.println("That day is Wednesday\n");
			System.exit(0);
		case 5 : 
			System.out.println("That day is thursday\n");
			System.exit(0);
		case 6 : 
			System.out.println("That day is Friday\n");
			System.exit(0);
		case 7 : 
			System.out.println("That day is Saturday\n");
			System.exit(0);
	}
	return 0;
}

	public static void main(String[] args) {
		isPositive();
		greatestValue();
		smallLargeTest();
		weekDay();
	}
}
