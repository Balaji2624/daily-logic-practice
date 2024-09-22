// find the Highest Common Factor(HCF) from two number.

package date18_04;

public class HCF {
	public static int findHCF(int a, int b)
	{
		while(b != 0)
		{
			int temp=b;
			b=a%b;
			a=temp;
			
		}
		return a;
	}
    public static void main(String args[])
    {
    	System.out.println("HCF of given two number is : "+findHCF(10,20));
    	
    }
}
