package date20_04;

import java.util.HashSet;
import java.util.Set;

public class arrayUnion {
      public static void main(String args[])
      {
    	  int[] arr1= {1,3,4,5,6,2};
    	  int[] arr2= {2,5,7,8};
    	  
    	  Set<Integer> set=new HashSet<Integer>();
    	  for(int value : arr1)
    	  {
    		  set.add(value);
    	  }
    	  for(int b : arr2)
    	  {
    		  set.add(b);
    	  }
    	  System.out.println("union of array : "+set);
      }
}
