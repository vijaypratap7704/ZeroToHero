package Getting.Started.With.Java.methods;

public class FibonnaciSequence
{
	   static int[] fibo(int n)
	    {
	        int[] fib = new int [n];
	        if (n < 1)
	        {
	            System.out.println("It seems the number of desired Fibonacci numbers has got an invalid value: " + n);
	        }
	        else
	        { 
	            if (n > 1)
	            {
	                fib[1] = 1;
	            }
	            int count = 2;
	            while (count < n)
	            {
	                fib[count] = fib[count - 2] + fib[count - 1];
	                count += 1;
	            }
	        }
	        return fib;
	    }

	    public static void main(String args[]) 
	    {
	        int nterms = 10;
	        int[] a = fibo(nterms);
	        System.out.println("First " + nterms + " terms of Fibonacci sequence are: ");
	        for (int i = 0; i < a.length; i++) //for loop to print the array 
	        { 
	            System.out.print(a[i] + " ");  
	        }
	        System.out.println("\n*** End of generating Fibonacci Numbers ***");
	    }
	}
