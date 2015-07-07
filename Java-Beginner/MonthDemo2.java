package chapter6;

/**
 * Month Class Demo Program 2
 */

public class MonthDemo2 {
	public static void main(String[] args) {
		// Use the 2nd constructor to create two objects.
		Month m1 = new Month(10);
		Month m2 = new Month(5);
		System.out.println("Month " + m1.getMonthNumber() + " is " + m1);
		System.out.println("Month " + m2.getMonthNumber() + " is " + m2);

		// Test for equality.
		if (m1.equals(m2))
			System.out.println(m1 + " and " + m2 + " are equal.");
		else
			System.out.println(m1 + " and " + m2 + " are NOT equal.");

		// Is m1 greater than m2?
		if (m1.greaterThan(m2))
			System.out.println(m1 + " is greater than " + m2);
		else
			System.out.println(m1 + " is NOT greater than " + m2);

		// Is m1 less than m2?
		if (m1.lessThan(m2))
			System.out.println(m1 + " is less than " + m2);
		else
			System.out.println(m1 + " is NOT less than " + m2);
	}
}
