package date14_09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePinCode {

     private static final String PINCODE_PATTERN = "^[1-9][0-9]{5}$";
     public static boolean validatePinCode(String pincode){
         Pattern pattern = Pattern.compile(PINCODE_PATTERN);
         Matcher matcher = pattern.matcher(pincode);
         return matcher.matches();
     }

     public static void main(String[] args) {
         String pincodeToValidate = "400088";

         if(validatePinCode(pincodeToValidate)){
             System.out.println(pincodeToValidate+ " is valid pincode.");
         }
}
}
