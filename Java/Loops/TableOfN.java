package Getting.Started.With.Java.Loops;

import java.util.Scanner;

public class TableOfN
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Print the multiplication table for the first 20 multiples
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 20; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
