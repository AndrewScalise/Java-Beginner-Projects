package chapter6;

/**
 * Month Class Demo Program 3
 */

public class MonthDemo3 {
	public static void main(String[] args) {
		// Use the 3rd constructor to create three objects.
		Month m1 = new Month("March");
		Month m2 = new Month("December");
		Month m3 = new Month("Bad Month");
		System.out.println("Month " + m1.getMonthNumber() + " is " + m1);
		System.out.println("Month " + m2.getMonthNumber() + " is " + m2);
		System.out.println("Month " + m3.getMonthNumber() + " is " + m3);
	}
}
