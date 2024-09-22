package date20_04;

public class PowerOfNumber {
      public static double power(double b, int e)
      {
    	  double result=1;
    	  for(int i=1;i<=e;i++)
    	  {
    		  result=result*b;
    	  }
    	  return result;
      }
      public static void main(String args[])
      {
    	  System.out.println(" rises the  "+power(4,2));
      }
}
