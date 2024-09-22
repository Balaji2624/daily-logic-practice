// Write a program to remove dublicate from from string.

package date19_04;

import java.util.HashSet;
import java.util.Set;

public class RemoveDubicate {
      public static void main(String args[])
      {
    	  String str="cgtasxbgbbssbb";
    	  Set<Character> set=new HashSet<Character>();
    	  for(char ch : str.toCharArray())
    	  {
    		  set.add(ch);
    	  }
    	  for(char ch : set)
    	  {
    		  System.out.print(ch);
    	  }
      }
}
