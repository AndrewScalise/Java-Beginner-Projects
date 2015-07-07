package chapter6;

/*
 * Andrew Scalise
 * Chapter 7
 * Programming Challenge # 2
 * Payroll Class: This program will ask the user for
 * employee hours and pay rate. It will then display each
 * employee's identification number and gross wages.
 */

import java.util.Scanner;

public class Payroll {
	
	final int NUM_EMPLOYEES = 7;		// Number of employees
	int[] employeeID = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};		// Employee Id numbers
	int[] hours = new int[NUM_EMPLOYEES];				// Hours worked
	double[] payRate = new double[NUM_EMPLOYEES];		// Pay rate for employees
	double[] wages = new double[NUM_EMPLOYEES];			// Employee's gross wages
	int index;											// Holder for array's
	static Scanner keyboard = new Scanner(System.in);	// Create Scanner for input
	
	
	// Set up new arrays for payroll
	
	public Payroll()
	{
		hours = new int[7];
		payRate = new double[7];
		wages = new double[7];
	}
	
	// Get the hours and payrate for each employee
	public void HoursandPayRate()
	{
		for(int i=0; i < NUM_EMPLOYEES; i++)
		{
			// Ask for the hours worked by each employee
			System.out.println("Enter the hours worked by employee number " 
					+ employeeID[i] + ": ");
			hours[i] = keyboard.nextInt();
			
			//If hours worked by employee are less than 0 ask again
			while(hours[i] < 0)
			{
				System.out.println("ERROR: Enter 0 or greater for hours: ");
				hours[i] = keyboard.nextInt();
			}
			
			// Get the hourly pay rate for each employee
			System.out.println("Enter the hourly pay rate for employee number " 
					+ employeeID[i] + ": ");
			payRate[i] = keyboard.nextDouble();
			
			// If hourly pay rate is less than 6 dollars ask again
			while(payRate[i] < 6.00)
			{
				System.out.println("ERROR: Enter 6.00 or greater for pay rate: ");
				payRate[i] = keyboard.nextDouble();
			}
		}
	}
	
	
	
	// Display wages
   public void returnWages(){
	   
	   // Display Payroll DATA
		
			System.out.println("\n\nPAYROLL DATA");
			System.out.println("=============");
			for(int i=0; i<NUM_EMPLOYEES; i++)
			{
				//calculate wages
				wages[i] = hours[i] * payRate[i];
				
				//display employee data
				System.out.println("Employee ID: " + employeeID[i]);
				System.out.println("Gross pay: $" + wages[i]+ "\n");
			}
   }
}