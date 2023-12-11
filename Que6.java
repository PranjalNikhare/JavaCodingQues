package Assignment;
import java.io.*;
import java.util.Scanner;


public class Que6 {
	class reverseString {
	    public static void main (String[] args) {
	       
	        String oString= "Welcome", rString="";
	        char ch;
	       
	      System.out.print("Original word: "+ oString +"\n");
	      
	       
	      for (int i=0; i<oString.length(); i++)
	      {
	        ch= oString.charAt(i); 
	        rString= ch+rString; 
	      }
	      System.out.println("Reversed word: "+ rString);
	    }
	}

}
