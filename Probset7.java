
package probset7;

import java.util.*;
public class Probset7 {

    
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int x,y,i;
    for(i=1;i<=3;i++){
    System.out.println("Enter Integer:  ");
    x=s.nextInt();
    x = x % 2;
    if(x % 2 == 0){
        System.out.print(x);
    }
    else if (x % 2 == 1){
        System.out.print(x);
    }
    
    }
    }
}
