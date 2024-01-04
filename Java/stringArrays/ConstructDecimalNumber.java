package Getting.Started.With.Java.stringArrays;

public class ConstructDecimalNumber{
    public static void main(String args[]) 
    {
       int[] arr= {1, 2, 3, 4, 5};
        int num = 0;
        num += arr[0] * ((int) Math.pow(10, 4));
        num += arr[1] * ((int) Math.pow(10, 3));
        num += arr[2] * ((int) Math.pow(10, 2));
        num += arr[3] * ((int) Math.pow(10, 1));
        num += arr[4] * ((int) Math.pow(10, 0));
        System.out.println(num);
    }
}
