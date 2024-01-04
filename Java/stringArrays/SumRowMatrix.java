package Getting.Started.With.Java.stringArrays;

public class SumRowMatrix{
    public static void main(String args[]) 
    {
        int[][] a = {{10, 20, 30},
                     {40, 50, 60}};  // Creating a matrix
  
        int sumRow1 = a[0][0] + a[0][1] + a[0][2]; // Calculating sum of first row
        int sumRow2 = a[1][0] + a[1][1] + a[1][2]; // Calculating sum of second row
        System.out.println("Matrix: ");
        for (int i = 0; i < 2; i++) // printing a 2-dimensional array
        {
            for (int j = 0; j < 3; j++)
                System.out.print(a[i][j] + "\t");
            
            System.out.println(" ");
        }
        System.out.println("Sum of Row1: " + sumRow1);
        System.out.println("Sum of Row2: " + sumRow2);
    }
}
