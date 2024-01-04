package Getting.Started.With.Java.Loops;

import java.util.Scanner;

public class HollowSquare {
    public static void main( String args[]) 
    {
        Scanner myObj = new Scanner(System.in); 
        int n = 0;
        System.out.println("Enter value;");
        n = myObj.nextInt();
        for (int x = 0; x < n; x++)
        {
            for (int y = 0; y < n; y++)
            {
                if (x == 0 || x == n - 1 || y == 0 || y == n - 1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}