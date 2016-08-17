
package probset6;
import java.util.*;

public class Probset6 {

    
    public static void main(String[] args) {
       String orig, rvrs = "";
      Scanner s= new Scanner(System.in);
 
      System.out.println("Enter a string to check if it is a palindrome");
      orig = s.nextLine();
 
      int length = orig.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         rvrs = rvrs + orig.charAt(i);
 
      if (orig.equals(rvrs))
         System.out.println("Entered string is a palindrome.");
      else
         System.out.println("Entered string is not a palindrome.");
 
    }
    
}
