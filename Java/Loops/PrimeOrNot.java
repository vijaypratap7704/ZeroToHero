package Getting.Started.With.Java.Loops;

import java.util.Scanner;

public class PrimeOrNot
{
    public static void main( String args[] ) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        boolean isPrime = isPrimeNumber(number);
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
     private static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }

        return true; 
    }
}
