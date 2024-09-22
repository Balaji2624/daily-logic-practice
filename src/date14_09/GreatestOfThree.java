// find the greatest number from the three given numbers

package date14_09;

public class GreatestOfThree {
      public static void main(String args[])
      {
    	  int a=10;
    	  int b=20;
    	  int c=30;
    	  
    	  int x=a > b ? a:b;
    	  int y=b > c ? b:c;
    	  if(x > y)
    	  {
    		  System.out.println(x+" is greatest number from all the numbers");
    	  }else if(y>x)
    	  {
    		  System.out.println(y+" is greatest number from all the numbers");
    	  }else {
    		  System.out.println("All the numbers are same");
    	  }
      }
}
