package chapter2;
// Use input operations
import javax.swing.JOptionPane;

/* Write a program that asks the user for the number of miles
 * driven and the gallons of gas used. It should calculate the
 * car's miles-per-gallon and display the result on the screen. */

public class MilesperGallon {

	public static void main(String[] args) 
	{
		double miles, gallons, mpg; // Data needed for calculations
		String inputMiles; // User's number of miles
		String inputGallons; // User's used gallons
		
		//Get miles driven
		inputMiles = JOptionPane.showInputDialog("Enter the miles driven:");
		
		//Convert input into a double
		miles = Double.parseDouble(inputMiles);
		
		//Get gallons used
		inputGallons = JOptionPane.showInputDialog("Enter the gallons of fuel used:");
		
		//Convert input into a double
		gallons = Double.parseDouble(inputGallons);
		
		//Calculate mpg
		mpg = miles / gallons;
		
		//Display the results
		System.out.printf("Enter the miles driven: %.0f\n", miles);
		System.out.printf("Enter the gallons of fuel used: %.0f\n", gallons);
		System.out.println("The miles-per-gallon is " + mpg);
		
		// End the program.
		System.exit(0);
		
	

	}

}
