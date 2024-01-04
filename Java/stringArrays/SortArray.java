package Getting.Started.With.Java.stringArrays;

public class SortArray {
    public static void main(String[] args) 
    {
         int array1[] = {5, 2, 7, 9, 1};
        int temp = 0;
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < (array1.length - i - 1); j++)
            {
                if (array1[j] > array1[j + 1])
                {
                    temp = array1[j];
                    array1[j] = array1[ j +1];
                    array1[j + 1] = temp;
                }
            }
        }
        System.out.println("The sorted array is: ");
        for (int i = 0; i < array1.length; i++)
        {
            System.out.print(array1[i] + "  ");
        }
    }

}
