package Getting.Started.With.Java.Loops;

import java.util.Scanner;

public class AverageValue {
    public static void main(String[] args) 
    {
       Scanner myObj = new Scanner(System.in);
       int count = 0;
       int sum =0;
       int value = myObj.nextInt();
       while(value != 0){
           sum = sum+value;
           value = myObj.nextInt();
       }
       System.out.println(sum);
    }
}
