
package problemset5;

import java.util.Scanner;


public class Problemset5 {

    
    public static void main(String[] args) {
       Scanner s=new Scanner (System.in);
       double x,y;
       int i;
       for (i=1;i<=3;i++){
           System.out.println("Enter Integer:   ");
           x=s.nextDouble();
           System.out.println("Enter Power:   ");
           y=s.nextDouble();
           System.out.println(Math.pow(x,y));
    }
    }
}
