// Write a program to find second largest number from an Array.

package date19_04;

public class SecondLargest {
     public static void main(String args[])
     {
    	 int[] arr= {10,5,32,45,23,40,60,20};
    	 int s_max=0;
    	 int max=arr[0];
    	 for(int i=1;i<arr.length;i++)
    	 {
    		 if(arr[i] > max)
    		 {
    			 s_max=max;
    			 max=arr[i];
    		 }else if(arr[i] > s_max && arr[i] != max)
    		 {
    			 s_max=arr[i];
    		 }
    	 }
    	 System.out.println("Second Maximium from an Array is : "+s_max);
     }
}
