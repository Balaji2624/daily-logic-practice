// Write a program to remove all non-alphabetic characters from a string.

package date20_04;

import java.util.Scanner;

public class RemoveNonAlphabetic {
      public static void main(String args[])
      {
    	  Scanner scan=new Scanner(System.in);
    	  System.out.println("Enter a String : ");
    	  String str=scan.nextLine();
    	  StringBuilder result = new StringBuilder();
    	  
    	  for(int i=0;i<str.length();i++)
    	  {
    		  char ch=str.charAt(i);
    		  if(Character.isAlphabetic(ch))
    		  {
    			 result.append(ch); 
    		  }
    	  }
    	  System.out.println("Output : "+result.toString());
      }
}
