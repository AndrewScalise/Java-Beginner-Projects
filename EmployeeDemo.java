package chapter3;
/**
 * Written by Student Programmer
 * Chapter 3
 * Assignment 3: Employee Class
 *
 * This program demonstrates the Employee class.
 */

public class EmployeeDemo
{
	public static void main(String[] args)
	{
		// Create three instances of the Employee class.
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		
		// Store data for the first employee.
				employee1.setName("Susan Meyers");
				employee1.setIdNumber(47899);
				employee1.setDepartment("Accounting");
				employee1.setPosition("Vice President");
				
				// Store data for the second employee.
				employee2.setName("Mark Jones");
				employee2.setIdNumber(39119);
				employee2.setDepartment("IT");
				employee2.setPosition("Programmer");

				// Store data for the third employee.
				employee3.setName("Joy Rogers");
				employee3.setIdNumber(81774);
				employee3.setDepartment("Manufacturing");
				employee3.setPosition("Engineer");
				
		// Display the data for employee 1.
		System.out.println("Employee #1");
		System.out.println("Name: " + employee1.getName());
		System.out.println("ID Number: " + employee1.getIdNumber());
		System.out.println("Department: " + employee1.getDepartment());
		System.out.println("Position: " + employee1.getPosition());
		System.out.println();
		
		// Display the data for employee 2.
		System.out.println("Employee #2");
		System.out.println("Name: " + employee2.getName());
		System.out.println("ID Number: " + employee2.getIdNumber());
		System.out.println("Department: " + employee2.getDepartment());
		System.out.println("Position: " + employee2.getPosition());
		System.out.println();
		
		// Display the data for employee 3.
		System.out.println("Employee #3");
		System.out.println("Name: " + employee3.getName());
		System.out.println("ID Number: " + employee3.getIdNumber());
		System.out.println("Department: " + employee3.getDepartment());
		System.out.println("Position: " + employee3.getPosition());
		System.out.println();
	}
}

