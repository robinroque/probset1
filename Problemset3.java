
package problemset3;

import java.util.Scanner;


public class Problemset3 {

    
    public static void main(String[] args) {
       Scanner s=new Scanner (System.in);
       int x,i;
       for (i=1;i<=3;i++){
           System.out.print("Enter Integer:   ");
           x=s.nextInt();
           System.out.print(Math.abs(x));
    }
    }
}
