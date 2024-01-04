package Getting.Started.With.Java.stringArrays;

public class SumColumnMatrix 
{
    public static void main( String args[] ) 
    {
        int rows = 5;
        int cols = 10;
        int[][] mat = {{0, 1, 2, 3, 4, 5, 6, 7, 8,9},
                       {10, 11, 12, 13, 14, 15, 16, 17, 18, 19},
                       {20, 21, 22, 23, 24, 25, 26, 27, 28, 29},
                       {30, 31, 32, 33, 34, 35, 36, 37, 38, 39},
                       {40, 41, 42, 43, 44, 45, 46, 47, 48, 49}};  // Creating a matrix
  
        System.out.println("Displaying in the matrix form: ");
        for (int i = 0; i < rows; i++) // printing a 2-dimensional array
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println(" ");
        }
        int[] colsum = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        
        for (int j = 0; j < cols; j++)
        {
            for (int i = 0; i < 5; i++ )
            {
                colsum[j] += mat[i][j];  //calculating sum 
            }
        }

        System.out.print("Column sums are: ");
        for (int i = 0; i < 10; i++) // printing a 2-dimensional array
        {
            System.out.print(colsum[i] + " ");
        }
    }
}
