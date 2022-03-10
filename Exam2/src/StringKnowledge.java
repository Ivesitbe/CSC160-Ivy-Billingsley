
public class StringKnowledge {
	public static boolean endOther(String phrase1, String phrase2) {
		phrase1 = phrase1.toLowerCase();
		phrase2 = phrase2.toLowerCase();
		String compareString = "";
		System.out.print("checks to see if either string ends with the other\n");
		
		// - Tells you what the method does, sends both string to lower-case.
		
	
		if(phrase1.length() > phrase2.length()) 
		{
			 // System.out.print(phrase1);
			 // - Test to see if I can get it to compare at a glance
			
			 for(int i = 0; i < phrase1.length(); i++) 
			 {
				 
				 if(phrase1.charAt(i) == phrase2.charAt(0)) 
				 {
					 compareString = "";
				 }
				 compareString = compareString + phrase1.charAt(i);
			 }
			 
			 if(compareString.equals(phrase2)) {
				 return true;
			 }else {
				 return false;
			 }
			 
		}else {
			//System.out.print(phrase2);
			
			for(int i = 0; i < phrase2.length(); i++) 
			{
				if(phrase2.charAt(i) == phrase1.charAt(0)) 
				{
					compareString = "";
				}
				compareString = compareString + phrase2.charAt(i);
			}
			 if(compareString.equals(phrase1)) {
				 return true;
			 }else {
				 return false;
			 }
		}
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.print(endOther("testSringother", "other"));
	}
	

}
