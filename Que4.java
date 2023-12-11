package Assignment;
import java.util.Arrays;

public class Que4 {
	class Main {
		  public static void main(String[] args) {
		    String string1 = "Welcome";
		    String string2 = "ceelmow";
		    
		    string1 = string1.toLowerCase();
		    string2 = string2.toLowerCase();

		    
		    if(string1.length() == string2.length()) {

		    
		      char[] charArray1 = string1.toCharArray();
		      char[] charArray2 = string2.toCharArray();

		      
		      Arrays.sort(charArray1);
		      Arrays.sort(charArray2);

		      
		      boolean result = Arrays.equals(charArray1, charArray2);

		      if(result) {
		        System.out.println(string1 + " and " + string2 + " are anagram.");
		      }
		      else {
		        System.out.println(string1 + " and " + string2 + " are not anagram.");
		      }
		    }
		    else {
		      System.out.println(string1 + " and " + string2 + " are not anagram.");
		    }
		  }
		}

}
