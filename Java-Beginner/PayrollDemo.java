package chapter6;

/*
 * Andrew Scalise
 * Chapter 7
 * Programming Challenge # 2
 * Payroll Class: This program will ask the user for
 * employee hours and pay rate. It will then display each
 * employee's identification number and gross wages.
 */


public class PayrollDemo {
	
	public static void main(String[] arg){
		// Make a new payroll
		Payroll pay = new Payroll();
		
		// Ask the user for the employee informations
		pay.HoursandPayRate();
		
		// Display the information
		pay.returnWages();

}
}
