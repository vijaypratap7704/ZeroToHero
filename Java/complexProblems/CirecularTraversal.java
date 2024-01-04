package Getting.Started.With.Java.complexProblems;

public class CirecularTraversal 
{
    static void printArray(int[] a, int size)
    {
        for (int i = 0; i < size; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
    }
    
    public static void main(String args[]) 
    {
        int[] a = {2, 8, 3, 15}; // Enter the array for circular traversal  
        int i = 0;
        int j = 0;
        int allneg = 0;
        int addneg = 0;
        int k , ii;

        while (allneg == 0) // This loop will terminate when the value of allneg is zero
        {
            if (a[i] > 0) // If the value of a is greater than zero
            {
                System.out.println("Now PROCESSING the index " + i);
            }
            else
            {
                if (i != j) // If i is not equal to j
                {
                    System.out.println("Now skipping the index " + i);
                }
                else
                {
                    System.out.println("Now STOPPING at the index " + i);
                }
            }
            System.out.print(i+" ");
            printArray(a, a.length);
            if (a[i] > 0)  // If the value of a is greater than zero
            {
                a[i] = -a[i]; // Converting value to negative value
                k = 0;
                ii = i; // Storing value of i in ii
                System.out.println("Moving " + -a[i] + " steps");
                while (k < -a[i]) // This loop will terminate when k is not less than -a[i]
                {
                    ii = (ii + 1) % a.length;
                    k += 1;
                    System.out.print(". " + ii + " ");
                    printArray(a, a.length);
                }
                i = ii ;// Storing the updated value of ii to i
                addneg = 1;
            }
            else // If the value of a is not greater than zero
            {
                if (addneg == 1)  // If the value of addneg is 1
                {
                    j = i;
                    addneg = 0; // Change the value of addneg to 0
                }
                else
                {
                    if (j == i) // If i is equal to j
                        allneg = 1;
                }
                i = (i + 1) % a.length; // Update value of i
            }
        }
        System.out.println(" *** DONE *** ");
    }
}