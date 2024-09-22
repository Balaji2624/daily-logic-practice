// Write a program to find the occurrence of the word in given string

package date13_09;

public class OccuranceOfWords {
       public static void main(String args[])
       {
    	   String str="India is my country I love India";
    	   String name="India";
    	   String[] words=str.split("\\s+");
    	   int count=0;
    	   for(int i=0;i<words.length;i++)
    	   {
    		   if(name.equalsIgnoreCase(words[i]))
    		   {
    			   count++;
    		   }
    	   }
    	   System.out.println("count of the given words is : "+count);
       }
}
