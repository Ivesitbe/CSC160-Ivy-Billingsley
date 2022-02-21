import java.util.Scanner;

public class RightTri {
	public static void userInput() {
		Scanner in = new Scanner(System.in);
		int pickedNum;
		System.out.print("please input the number of lines you want");
		pickedNum = in.nextInt();
		for(int i = 1; i <= pickedNum; i++) {
			int lineNum = 0;
			while(lineNum < i) {
				lineNum++;
				System.out.print(lineNum);
			}
			
			System.out.print("\n");
		}
		
	}
	public static void main(String[] args) {
		userInput();
		
	}

}
