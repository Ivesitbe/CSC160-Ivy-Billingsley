
public class ScrabbleWord {
	
	public static boolean isWord(String scrabbleS,String targetWord) 
	{
		String charString = "";
		String scrapChars = "";
		for(int i = 0; i < scrabbleS.length();i++) 
		{
			
			for(int j = 0; j < targetWord.length();j++) 
			{
				if(scrabbleS.charAt(i) == targetWord.charAt(j)) 
				{
					charString = charString + scrabbleS.charAt(i);
					
				
					// - I'm getting the string to form and I can compare it to target word
					// - but how it is returning is not doing what it says it should
					// - I'm pretty annoyed by it
					// - prints the spelled word up to 
				}else {
					scrapChars = scrapChars + scrabbleS.charAt(i);
					
				}
			}
			
		}
		//System.out.print(scrapChars + " < Scrap chars |||| ");
		//System.out.print(charString + " < Target word |||| ");
		// - ^^ tests to see if it loops properly
		
		//System.out.print(targetWord);
		// - wanted to see the char string prints it does.
		System.out.print(charString);
		
		if(charString.equals(targetWord)) {
			System.out.print(" you can spell the word");
		}else {
			System.out.print("you cannot spell the word");
		}
		return true;
	}
	// Method to Scrabble check
	
	
	public static void main(String[] args) 
	{
		isWord("blhysadsas","hey");
	}

}
