// Write a program to check given number is perfect number or NOT

package date14_09;

public class PerfectNo {
       public static void main(String args[])
       {
    	   int n=6;
    	   int sum=0;
    	   for(int i=1;i<n;i++)
    	   {
    		   if(n % i == 0)
    		   {
    			   sum=sum+i;
    		   }
    	   }
    	   if(sum == n)
    	   {
    		   System.out.println("Given number is Perfect number");
    	   }else {
    		   System.out.println("Given number is NOT perfect number");
    	   }
       }
}
