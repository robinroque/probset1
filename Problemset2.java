
package problemset2;

import java.util.*;
public class Problemset2 {

  
    public static void main(String[] args) {
       Scanner s=new Scanner (System.in);
       int x,i;
       for (i=1;i<=3;i++){
           System.out.print("Enter Integer:   ");
           x=s.nextInt();
           if(x>0){
               System.out.println("True");
           }
           if(x<0){
           System.out.println("false");      
           }
                   }
    }
}