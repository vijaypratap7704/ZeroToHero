package Getting.Started.With.Java.stringArrays;

public class PalindromeTest
{
    public static void main(String[] args) 
    {
        int u[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 21, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int pflag = 1;
        int length = 24; 
        length = length / 2;
        int check = 23;
        for (int a = 0; a < length; a++)
        {
            if(u[a] != u[check])
            {
                pflag = 0;
            }
            check --;
        }
        if (pflag == 0)
        {
            System.out.println("This array is NOT a palindrome!");
        }
        else 
        {
            System.out.println("This array is a PALINDROME!");
        }

        pflag =1;
        int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        length = 23;
        check = 22;
        for (int a = 0; a < length; a++)
        {
            if(v[a] != v[check])
            {
                pflag = 0;
            }
            check --;
        }   
        if (pflag == 0)
        {
            System.out.println("This array is NOT a palindrome!");
        }
        else 
        {
            System.out.println("This array is a PALINDROME!");
        }
    }
}