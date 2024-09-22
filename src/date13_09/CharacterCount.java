// Write a program to find count of given character in the String.

package date13_09;

import java.util.Scanner;

public class CharacterCount {
      public static void main(String args[])
      {
    	  Scanner scan = new Scanner(System.in);
    	  String str="aaabbhcccdd";
    	  System.out.println("Enter a character : ");
    	  char ch=scan.next().charAt(0);
    	  int count=0;
    	  for(int i=0;i<str.length();i++)
    	  {
    		  if(ch == str.charAt(i))
    		  {
    			  count++;
    		  }
    	  }
    	  System.out.println("Count of the character "+ch+" is : "+count);
    	  
      }
}
