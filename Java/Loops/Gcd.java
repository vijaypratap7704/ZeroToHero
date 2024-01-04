package Getting.Started.With.Java.Loops;

import java.util.Scanner;

public class Gcd {
	  public static void main(String[] args) 
	  {
	    int a = 0;
	    int b = 0;
	    int r = 0;
	    Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter number 1: ");
	    a = myObj.nextInt();
	    System.out.println("Enter number 2: ");
	    b = myObj.nextInt();
	    while (b != 0)
	    {
	      r = a % b;
	      a = b;
	      b = r;
	    }
	    System.out.println ("The greatest common divisor is: " + a);
	  }
	}
