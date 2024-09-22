package date20_04;

public class MissingNumber {
      public static void main(String args[])
      {
    	  int[] arr= {1,2,4,5,6};
    	  int n=arr.length+1;
    	  int totalSum=n*(n+1)/2;
    	  int arrsum=0;
    	  int missingElement;
    	  for(int value : arr)
    	  {
    		  arrsum=arrsum+value;
    	  }
    	  missingElement = totalSum - arrsum;
    	  System.out.println("Missing Element in the Given Array is : "+missingElement);
     }
}
