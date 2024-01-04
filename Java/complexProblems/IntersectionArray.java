package Getting.Started.With.Java.complexProblems;

public class IntersectionArray{
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
        int[] p = {2, 5, 5, 8, 8, 8, 9, 30, 45}; // Enter the array 1
        int[] q = {4, 5, 5, 6, 7, 7, 8, 8, 9, 10, 45}; // Enter the array 2
        int lp = p.length; // Calculating the length of p
        int lq = q.length; // Calculating the length of q
        int lr;
        if (lq < lp)
        {
            lr = lq;
        }
        else
        {
            lr = lp;
        }
        int[] r = new int[lr]; // Creating r of zeros
        int i, j, k;
        i = j = k = 0;

        while ((i < lp) && (j < lq)) // This loop will terminate when the values of i,j are not less than lp and lq
        {
            if (p[i] == q[j]) // If the element of p is equal to the element of q
            {
               r[k] = p[i]; // Assigning value of p to k
               i += 1;
               j += 1;
               k += 1;
            }
            else // If the element of p is not equal to the element of q
            {
                if (p[i] < q[j]) // If the element of p is less than the element of q
                {
                    i += 1;
                }
                else // If the element of p is not less than the element of q
                {
                    j += 1;
                }
            }
        }
        printArray(p, p.length);
        printArray(q, q.length);
        printArray(r, k);
    }
}

