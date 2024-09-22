// write a program to check given string is rotational to each other or NOT.

package date13_09;

public class RotationalStr {
          public static void main(String args[])
          {
        	  String str1="Welcome";//welcomeWelcome
        	  String str2="comeWel";
        	  String str=str1+str1;
        	  if(str1.length()==str2.length())
        	  {
        		  if(str.contains(str2))
        		  {
        			  System.out.println("Given two string are Rotational to each other");
        		  }else {
        			  System.out.println("Given two string are NOT Rotational to each other");
        		  }
        	  }else {
        		  System.out.println("Given two string are NOT Rotational to each other");
        	  }
          }
}
