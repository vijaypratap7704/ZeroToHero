package Getting.Started.With.Java.Loops;

public class GeometricSequence {
    public static void main(String[] args) 
    {
        int value = 1;
        while(value<1000){
            System.out.println(value);
            value = value+value*2;
        }
    }
}
