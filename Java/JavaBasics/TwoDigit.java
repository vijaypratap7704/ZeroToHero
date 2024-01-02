package Getting.Started.With.Java.JavaBasics;

import java.util.Scanner;
class TwoDigit 
{
    public static void main(String args[]) 
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input two digit nymber");
        int number = myObj.nextInt();  
        if(number<10 || number>99){
            System.out.println("Not two digits");
        }
        else{
            System.out.println("Two Digit");
        }
    }
}