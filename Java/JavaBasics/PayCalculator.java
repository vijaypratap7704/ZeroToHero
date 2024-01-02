package Getting.Started.With.Java.JavaBasics;

import java.util.Scanner;
class PayCalculator 
{
    public static void main(String args[]) 
    {
         Scanner scanner = new Scanner(System.in);
            System.out.print("Enter total hours worked per week: ");
            double hoursWorked = scanner.nextDouble();

            System.out.print("Enter hourly pay rate: ");
            double hourlyRate = scanner.nextDouble();

            double regularPay, overtimePay, totalPay;

            if (hoursWorked <= 40) {
                regularPay = hoursWorked * hourlyRate;
                System.out.println("\nRegular Pay:" + String.format("%.2f", regularPay));
            } else {
                regularPay = 40 * hourlyRate;
                overtimePay = (hoursWorked - 40) * 1.5 * hourlyRate;
                totalPay = regularPay + overtimePay;

                System.out.println("\nRegular Pay:" + String.format("%.2f", regularPay));
                System.out.println("Overtime Pay:" + String.format("%.2f", overtimePay));
                System.out.println("Total Pay:" + String.format("%.2f", totalPay));

            }

            

    }
}
