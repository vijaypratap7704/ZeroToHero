package Getting.Started.With.Java.Loops;

import java.util.Scanner;

public class MeanInputs
{
    public static void main(String args[]) 
    {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of values to average: ");
        int numberOfValues = scanner.nextInt();
        if (numberOfValues <= 0) {
            System.out.println("Number of values must be greater than 0. Exiting program.");
            System.exit(0);
        }
        double sum = 0;
        for (int i = 1; i <= numberOfValues; i++) {
            System.out.print("Enter value " + i + ": ");
            double currentValue = scanner.nextDouble();
            sum += currentValue;
        }
        double average = sum / numberOfValues;
        System.out.println("The average is: " + average);
    }
}