package date12_09;

import java.util.Scanner;

public class PerfectNo {
    public static boolean perfect(int n)
    {
    	int sum=0;
    	for(int i=1;i<n;i++)
    	{
    		if(n % i == 0)
    		{
    			sum=sum+i;
    		}
    	}
    	return sum == n;
    }
    public static void main(String args[])
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter a Number : ");
    	int a= scan.nextInt();
    	if(perfect(a))
    	{
    		System.out.println("Given number is a Perfect Number");
    	}else {
    		System.out.println("Given number is NOT a Perfect Number");
    	}
    }
}
