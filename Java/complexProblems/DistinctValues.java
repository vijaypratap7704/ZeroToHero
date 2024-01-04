package Getting.Started.With.Java.complexProblems;

public class DistinctValues {
	    static void printArray(int[] a, int size)
	    {
	        for (int i = 0; i < size; i++)
	        {
	            System.out.print(a[i] + " ");
	        }
	        System.out.println("");
	    }

	    public static void main(String args[]) 
	    {
	        int[] p ={2, 5, 5, 8, 8, 8, 9, 30, 45}; // Enter the array
	        int lp = p.length; // Calculating the length of p
	        int[] r = new int[lp]; // Creating r of zeros
	        int i , k;
	        i = k = 1;

	        for (int j = 0 ; j < lp ; j++)
	        {
	            r[j] = p[0];
	        }
	        while (i < lp) // This loop will terminate when the value of i is not less than lp
	        { 
	            if (p[i] != p[i - 1]) // If the element of p is not equal to the previous element
	            {
	                r[k] = p[i]; // Assigning p to k
	                k += 1;
	            }
	            i += 1;
	        }
	        printArray(p, p.length);
	        printArray(r, k);
	    }
	}


