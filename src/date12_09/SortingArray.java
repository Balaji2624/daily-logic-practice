// Write a program to sort the Array without using Method.

package date12_09;

public class SortingArray {
	 public static void main(String args[])
     {
   	  int[] arr= {10,30,10,20,45,62,02,30,45,20};
   	  int temp;
   	  for(int n=0;n<arr.length;n++)
   	  {
   		  for(int j=n+1;j<arr.length;j++)
   		  {
   			  if(arr[j]<arr[n])
   			  {
   				  temp=arr[n];
   				  arr[n]=arr[j];
   				  arr[j]=temp;
   			  }
   		  }
   		  System.out.println(arr[n]);
   	  }
     }
}
