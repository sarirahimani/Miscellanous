package assignment1;

// We import the scanner
import java.util.Scanner;


public class SimpleClass {
	public static void main (String[] args) {
		
		//Create the scanner object to collect the user's input
		Scanner babyyoda=new Scanner(System.in);
		
		//We prompt the user to enter their salary
		//the double that is entered is collected by the scanner and stored in the variable number
		System.out.print("Enter your Salary in USD:");
		double number = babyyoda.nextDouble();
		
		//This allows us to remove the newline character
		babyyoda.nextLine();
		
		//We prompt the user to enter their name
		//the string that is entered is collected by the scanner and stored in the variable name
		System.out.print("Enter your name:");
		String name = babyyoda.nextLine(); 
		 
		//This statement calls the method display and passes the contents of number and name as arguments
		 display(number, name);
}
	//The method display takes 2 arguments a string and a double
	// the method displays/prints the string collected by the scanner
	//it also multiples the salary by 12 to get the yearly earnings and prints the earnings
	public static void display(double num, String str ) {
		double earn=num*12;
        System.out.println(str+" "+ "earns"+" "+ earn +" "+ "USD in a year."); 
        
         
}
}