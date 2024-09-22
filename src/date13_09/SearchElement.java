// Write a program to search a given number in an Array by using binary search.

package date13_09;

public class SearchElement {
      public static void main(String args[])
      {
    	  int[] arr= {10,20,45,55,60,75,80};
    	  int n=20;
    	  boolean isPresent=false;
    	  int l=0;
    	  int h=arr.length-1;
    	  int mid;
    	  while(l<=h)
    	  {
    		  mid=(l+h)/2;  
    		  if(arr[mid] == n)  
    		  {
    			  isPresent=true;
    			  break;
    		  }
    		  if(arr[mid] > n)  
    		  {
    			  h=mid-1;    
    		  }
    		  if(arr[mid] < n)    
    		  {
    			  l=mid+1;
    		  }
    	  }
    	  if(isPresent)
    	  {
    		  System.out.println("Given number is Present in the array");
    	  }else {
    		  System.out.println("Given number is NOT Present in the array");
    	  }
      }
}
