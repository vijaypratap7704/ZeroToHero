package Getting.Started.With.Java.stringArrays;

public class ArithmeticSequence
{
    public void main(String[] args)
    {
        // Assume that the following variable is already defined:
        // array1
        // You are required to use the above variables to find 
        // the index of the first outlier in the array and display it.
        // You may start your code from here to store the correct result in 
        // the variable index
    	int []array1 = {};
        int idx = 1;
        idx = findOutlierIndex(array1);

        if (idx == -1) {
            System.out.println("No outlier found.");
        } else if (idx == 0) {
            System.out.println("Array length is less than 5.");
        } else {
            System.out.println("The index of the first outlier is: " + idx);
        }
    }

    static int findOutlierIndex(int[] arr) {
        if (arr.length < 5) {
            return 0;  // Array length is less than 5
        }

        // Check for the required arithmetic sequence in the first two elements
        int diff = arr[1] - arr[0];

        // Iterate through the array to find the outlier
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return i;  // Found the first outlier
            }
        }

        return -1;  // No outlier found
    }
}
