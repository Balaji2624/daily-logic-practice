// Write a program to check given number is Armstrong or NOT.

package date14_09;

public class ArmstrongNumber {
       public static void main(String args[])
       {
    	   int n=153;
    	   int temp=n;
    	   int sum=0;
    	   int r;
    	   while(n>0)
    	   {
    		   r=n%10;
    		   sum=sum+r*r*r;
    		   n=n/10;
    	   }
    	   if(sum == temp)
    	   {
    		   System.out.println("Given number is Armstrong number");
    	   }else {
    		   System.out.println("Given number is NOT Armstrong number");
    	   }
       }
}
