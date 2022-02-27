

public class Time {
	public static void main (String[]args) {
		double time = 0;
		double hour = 1700;
		double minute = 49;
		double second = 47;
		double mNight = 2400;
		double dStart = 0000;
		
		// - to start the program i'll write a low effort line
		// - I need to make 1749:47 into seconds by using 0000 as the start time
		
		double hToMinutes = (((hour/100) * 60) + minute);
		double mToSeconds = ((hToMinutes * 60) + second);
		
		double remaining = (((2400/100) * 60) * 60) - mToSeconds;
		
		// - Outputs of values
		
		System.out.println(hToMinutes);
		System.out.println("it's been " + mToSeconds + " seconds since midnight");
		System.out.println("there are " + remaining + " seconds in the day");
		 
		
		
		
		
	
	
	
	
	
	
	}
}
