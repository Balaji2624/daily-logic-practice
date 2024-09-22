
package date13_09;

import java.util.Scanner;

public class FlipCoinProbability {
        public static void main(String args[])
        {
        	Scanner scan=new Scanner(System.in);
        	System.out.println("Enter the Value that how many flip the coin");
        	int flipCoin=scan.nextInt();
        	if(flipCoin < 0)
        	{
        		System.out.println("Enter a valid Onput, Input must be positive");
        		return;
        	}
        	double head=0;
        	double tail=0;
        	for(int i=1;i<=flipCoin;i++)
        	{
        		if(Math.random() < 0.5)
        		{
        			
        			head++;
        		}else {
        			tail++;
        		}
        	}
        	double headPercentage=(head / flipCoin)*100;
        	double tailPercentage=(tail / flipCoin)*100;
        	System.out.println("Head percentage : "+headPercentage);
        	System.out.println("Tail percentage : "+tailPercentage);
        }
}
