package Getting.Started.With.Java.methods;

public class MultiplicationTable {
    //Write your code here
    static void showTableOf4()
   {
       for(int i = 1; i < 21; i++)
       {
           System.out.println("4 x " + i + " = " + 4 * i);
       }
   }
 
   public static void main(String[] args) 
   {
       showTableOf4();
   }
}