package Getting.Started.With.Java.stringArrays;

public class FibonnaciSequence
{
    public static void main(String[] args) 
    {
         int[] fib = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 54, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181};
        int count = 2;
        int fibFlag = 1;
        while (count < 20 && fibFlag == 1)
        {
            if(fib[count] != fib[count - 2] + fib[count - 1])
            {
                fibFlag = 0;
                break;
            }
            count++;
        }
        if (fibFlag == 0)
        {
            System.out.println("It is not a Fibbonacci sequence due to the value " + fib[count - 1] + " at index " + (count - 1));
        }
        else
        {
            System.out.println("Hurrah ... we've got a Fibonacci sequence.");
        }
    }
}
