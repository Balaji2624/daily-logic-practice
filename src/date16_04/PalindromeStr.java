// Write a program to check given string is Palindrome OR NOT.

package date16_04;

public class PalindromeStr {
        public static void main(String args[])
        {
        	String str="BALAJI";
        	String rev="";
        	
        	for(int i=str.length()-1;i>=0;i--) 
        	{
        	    	rev=rev+str.charAt(i);
        	}
        	if(str.equals(rev))
        	{
        		System.out.println("Given String are Palindrome String");
        	}else {
        		System.out.println("Given String are NOT Palindrome String");
        	}
        }
}
