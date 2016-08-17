
package problemset4;

import java.util.Scanner;


public class Problemset4 {

    
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
       int x,y,i;
       for (i=1;i<=3;i++){
           System.out.print("Enter Num1:   ");
           x=s.nextInt();
           System.out.print("Enter Num2:   ");
           y=s.nextInt();
           System.out.print(Math.max(x,y));
       }
    }
    
}
