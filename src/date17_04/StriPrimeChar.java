// Write a program to print character from string array from prime Index.

package date17_04;

public class StriPrimeChar {
	public static boolean Prime(int n)
	{
		boolean isPrime = true;
		if(n == 0 || n == 1)
		{
			isPrime = false;
		}
		for(int i=2;i<n;i++)
		{
			if(n % i == 0)
			{
				isPrime= false;
				break;
			}
		}
		return isPrime;
	}
    public static void main(String args[])
    {
    	String[] arr = {"Balaji","Bhushan","Aakash","Gajanan","Ram","Sham"};
    	for(String str : arr)
    	{
    		for(int i=0;i<str.length();i++) {
    			if(Prime(i))
    			{
    				System.out.println(str.charAt(i));
    			}
    		}
    	}
    }
}
