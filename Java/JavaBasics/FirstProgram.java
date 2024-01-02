package Getting.Started.With.Java.JavaBasics;

import java.util.Scanner;

public class FirstProgram {


	    public static void main(String args[]) 
	    {
	        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	      
	        System.out.print("Enter user's name: ");
	        String userName = myObj.nextLine();
	        
	        System.out.print("Enter user's age: ");
	        String userAge = myObj.nextLine();
	        
	        System.out.print("Enter user's city: ");
	        String userCity = myObj.nextLine();
	        
	        System.out.print("Enter user's college: ");
	        String userCollege = myObj.nextLine();
	        
	        System.out.print("Enter user's profession: ");
	        String userProfession = myObj.nextLine();
	        
	        System.out.print("Enter user's pet name: ");
	        String userPet = myObj.nextLine();

	        System.out.print("There once was a person named " + userName);
	        System.out.print(" who lived in " + userCity);
	        System.out.print(". At the age of " + userAge);
	        System.out.print(", " + userName);
	        System.out.print(" went to college at " + userCollege);
	        System.out.print(". " + userName);
	        System.out.print(" graduated and went to work as a " + userProfession);
	        System.out.print(". Then, " + userName);
	        System.out.print(" adopted an animal named " + userPet);
	        System.out.print(". They both lived happily ever after!");
	    }
}
