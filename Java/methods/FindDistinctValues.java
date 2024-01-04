package Getting.Started.With.Java.methods;

public class FindDistinctValues
{
    //Write your code here
   static void showDistinct(int[] p)
    {
        int lp = p.length; // Calculating the length of p
        int[] r = new int[lp]; // Creating r of zeros
        int i , k;
        i = k = 1;

        for (int j = 0; j < lp; j++)
        {
            r[j] = p[0];
        }

        while (i < lp) // This loop will terminate until the value of i is less than lp
        { 
            if (p[i] != p[i - 1]) // If the element of p is not equal to the previous element
            {
                r[k] = p[i]; // Assigning p to k
                k += 1;
            }
            i += 1;
        }
        System.out.print("Original array: ");
        for (int l = 0; l < p.length; l++)
            System.out.print(p[l] + " ");

        System.out.print("\nDistinct array: ");
        for (int l = 0; l < k; l++)
            System.out.print(r[l] + " ");
    }

    public static void main(String[] args) 
    {
        int [] array={2, 5, 5, 8, 8, 8};
        showDistinct(array);
    }
}