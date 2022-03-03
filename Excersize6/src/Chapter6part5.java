public class Chapter6part5{
	public static boolean isDoubloon(final String s) {
		
		final String l = s.toLowerCase();{

	    for (int i = 0; i < l.length(); i++) {
	        int count = 0;
	        for (int j = 0; j < l.length(); j++) {
	           if (l.charAt(i) == l.charAt(j)) {
	              count++;
	              if (2 < count) {
	                return false; // more than twice
	              } 
	           }
	        }
	        if (1 == count) {
	            return false; // character occurs only once
	        	}
	    	}
		}
		return true;
	}
		
		
	public static void main(String[] args) {
		if(isDoubloon("Abba") == true){
			    System.out.println("True, This is a doubloon");
		}else{
			    System.err.println("False, This is not a doubloon");
		}  
	}
}