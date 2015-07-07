package chapter5;

import java.util.Scanner;

/**
 * Hotel Occupancy
 */

public class HotelOccupancy 
{
	public static void main(String[] args)
	{
		int MaxFloors;			// Max number of floors
		int MaxRooms;			// Max number of rooms
		int FloorCount;			// Floor counter
		double TotalRooms;			// Accumulator for rooms
		int OccupiedCount;		// Occupied counter
		double VacantCount;		// Vacant counter
		int TotalOccupied;		// Accumulator for occupancy
		int TotalVacant;		// Accumulator for vacancy
		double OccupancyRate;	// calculate occupancy rate
		
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		// Initialize Totals
		TotalRooms = 0;
		TotalOccupied = 0;
		TotalVacant = 0;
		
		// Get the maximum number of rooms
		System.out.println("How many floors does the hotel have? ");
		MaxFloors = keyboard.nextInt();
		
		// Validate the input
		while (MaxFloors < 1)
		{
			// Prompt the user to enter a correct value
			System.out.println("Invalid. Enter 1 or more: ");
			MaxFloors = keyboard.nextInt();
		}
		
		// Create an iteration for each floor
		for (FloorCount = 1; FloorCount <= MaxFloors; FloorCount++)
		{
			System.out.println("How many rooms does floor " + FloorCount
					+ " have? ");
			MaxRooms = keyboard.nextInt();
			
			//Validate the input
			while (MaxRooms <10)
			{
				System.out.println("Invalid. Enter 10 or more: ");
				MaxRooms = keyboard.nextInt();
			}
			
			// Accumulate the total number of rooms
			TotalRooms += MaxRooms;
			
			// Prompt for how many rooms are occupied
			System.out.println("How many occupied rooms does floor "
					+FloorCount + " have? ");
			OccupiedCount = keyboard.nextInt();
			
			// Accumulate the total number of occupied rooms
			TotalOccupied += OccupiedCount;
			
			// Calculate and accumulate vacancy
			VacantCount = MaxRooms - OccupiedCount;
			TotalVacant += VacantCount;
			
		}
		
		// Calcualte Occupancy Rate
		OccupancyRate = TotalOccupied / TotalRooms;
		
		//Display the numbers
		System.out.printf("\nNumber of rooms: %.0f\n", TotalRooms);
		System.out.println("Occupied rooms: " +TotalOccupied);
		System.out.println("Vacant rooms: " +TotalVacant);
		System.out.println("Occupancy rate: " +OccupancyRate);
		
	}
}
