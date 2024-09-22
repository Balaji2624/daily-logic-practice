package date17_04;

// Write a program to count the number of vowels and consonants in a given string.

import java.util.Scanner;

public class VowelConsonantCounter {
      public static void main(String args[])
      {
    	  Scanner scan=new Scanner(System.in);
    	  System.out.println("Enter a String : ");
    	  String str=scan.nextLine();
    	  
    	  str=str.toLowerCase();
    	  int vowelcount=0;
    	  int consonantCount=0;
    	  for(int i=0;i<str.length();i++)
    	  {
    		  char ch=str.charAt(i);
    		  if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u')
    		  {
    			  vowelcount++;
    		  }else if(ch >= 'a' && ch <= 'z') {
    			  consonantCount++;
    		  }
    	  }
    	  System.out.println("Vowel count : "+vowelcount);
    	  System.out.println("Consonant count : "+consonantCount);
      }
}
