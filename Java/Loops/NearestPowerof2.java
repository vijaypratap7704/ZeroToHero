package Getting.Started.With.Java.Loops;

public class NearestPowerof2 {
    public static void main(String[] args)
    {
        // Assume that the variable num is already defined.
        int pwr = 0; // The variable to store the result calculated with the help of number.
        // You are required to calculate the value of pow as
        // The power of 2 nearest to the number.
        // You may start your code from here onwards.
        int num = 50;
        int i=0;
        int previous,next;
        int lastpwr=0;
        while(num>pwr){
            lastpwr = (int)Math.pow(2,i);
            i++;
            pwr = (int)Math.pow(2,i);
        }
        previous = num-lastpwr;
        next = pwr-num;
        if(previous<=next){
            pwr = lastpwr;
        }
        System.out.println(pwr);
    }
}
