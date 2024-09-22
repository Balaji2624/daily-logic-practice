// Write a program to print the name of the student that start with character 'P'.

package date19_04;

public class StartwithCharacter {
     public static void main(String args[])
     {
    	 String[] arr= {"Pavan","Balaji","Prakash","Aakash"};
    	 System.out.println("Name of the student that name start with Character P : ");
    	 for(String name : arr)
    	 {
    		 if(name.startsWith("P"))
    		 {
    			 System.out.println(name);
    		 }
    	 }
     }
}
