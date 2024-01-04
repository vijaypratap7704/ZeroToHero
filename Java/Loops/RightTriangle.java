package Getting.Started.With.Java.Loops;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String args[]) 
    {
        Scanner myObj = new Scanner(System.in);
        int value = myObj.nextInt();
        for(int i=0;i<value;i++){
           for(int j=0;j<=i;j++){
               System.out.print("*");
           }
           System.out.println("");
       }
    }
}

