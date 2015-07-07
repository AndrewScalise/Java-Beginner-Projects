package chapter8;

/*
 * Andrew Scalise
 * Chapter 8
 * Programming Challenge 1, Backward String:
 * This program will take a string from 
 * the user and give the reverse of
 * the string back as output.
 * 
 */

import java.util.Scanner;

public class BackwardString {
	
	   public static void main(String args[])
	   {
		   
	      String something, backwards = "";		// Create strings for input and output
	      
	      //Create a scanner class for user input
	      Scanner keyboard = new Scanner(System.in);
	      
	      //Get a string from the user
	      System.out.print("Enter something: ");
	      something = keyboard.nextLine();
	      
	      // Record the length of the string the user input
	      int length = something.length();
	      
	      // For loop to put all the characters backwards
	      for ( int i = length - 1 ; i >= 0 ; i-- ){
	         backwards = backwards + something.charAt(i);
	      }
	      
	      // Output the backwards string
	      System.out.println(backwards);
	      
	      keyboard.close();
	   }
	   
	}