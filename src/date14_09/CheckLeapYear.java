// write a program to check given year is Leap year or NOT

package date14_09;

public class CheckLeapYear {
      public static void main(String args[])
      {
    	  int year=2020;
    	  
    	  if(year % 4 == 0 || year % 100 == 0 || year % 400 == 0)
    	  {
    		  System.out.println(year+" is Leap Year");
    	  }else {
    		  System.out.println(year+" is NOT leap year");
    	  }
      }
}
