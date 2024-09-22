package date14_09;

public class StringCompression {
      public static String compressString(String str)
      {
    	  StringBuilder compress=new StringBuilder();
    	  int count = 1;
    	  for(int i=1;i<str.length();i++)
    	  {
    		  if(str.charAt(i) == str.charAt(i-1))
    		  {
    			  count++;
    		  }
    		  else {
    			  compress.append(str.charAt(i-1)).append(count);
    			  count=1;
    		  }
    	  }
    	  compress.append(str.charAt(str.length()-1)).append(count);
    	  return compress.toString();
      }
      public static void main(String args[])
      {
    	  String input = "aabbbcccc";
          String compressed = compressString(input);
          System.out.println("Compressed String: " + compressed);
      }
}
