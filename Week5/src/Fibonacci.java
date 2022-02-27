import java.util.Scanner;

public class Fibonacci {
	public static void sequencer() {
		Scanner in = new Scanner(System.in);
		System.out.print("program will sequence your number");
		int num1 = 0;
		int num2 = 1;
		int n = 0;
		System.out.print("input a value");
		n =  in.nextInt();
		for(int i = 0; i <= n; i++) {
			int num3 = (num1 + num2);
			System.out.print(num3 + " ");
			num1 = num2;
			num2 = num3;
			
		}
		
	}
	public static void sequencer2() {
		Scanner in = new Scanner(System.in);
		System.out.print("program will sequence your number");
		int num1 = 0;
		int num2 = 1;
		int n = 0;
		int i = 0;
		System.out.print("input a value");
		n =  in.nextInt();
		while(i <= n) {
			int num3 = num1 + num2;
			System.out.print(num3 + " ");
			num1 = num2;
			num2 = num3;
			i++;
		}
	}
	public static void main (String[] args) {
		sequencer2();
		sequencer();
	}
}