package chapter6;
/*Andrew Scalise
 * Chapter 6 
 * Programming Challenge 5, Month Class
 * This program will display a month's number, and determine
 * which month is associated with which number. It will also
 * determine if a month is greater than, less than, or equal
 * to another month.
 */

public class Month {
	
	private int monthNumber;		//Holds the month number
	public Month() {
		monthNumber =1;				//No argument constructor
	}
	// Set number of month as argument
public Month(int m){
	// Value passed
	monthNumber = m;
	// Set value passed to 1 if not between 1 and 12
	if(monthNumber <1 || monthNumber > 12) {
		monthNumber = 1;
	}
}	
	//Constructor accepts the name of the month
public Month(String m) {
	// Set monthNumber to corresponding number
	if(m.equalsIgnoreCase("january")){
		monthNumber = 1;
	} else if(m.equalsIgnoreCase("february")){
		monthNumber = 2;
	} else if(m.equalsIgnoreCase("march")){
		monthNumber = 3;
	} else if(m.equalsIgnoreCase("april")){
		monthNumber = 4;
	} else if(m.equalsIgnoreCase("may")){
		monthNumber = 5;
	} else if(m.equalsIgnoreCase("june")){
		monthNumber = 6;
	} else if(m.equalsIgnoreCase("july")){
		monthNumber = 7;
	} else if(m.equalsIgnoreCase("august")){
		monthNumber = 8;
	} else if(m.equalsIgnoreCase("september")){
		monthNumber = 9;
	} else if(m.equalsIgnoreCase("october")){
		monthNumber = 10;
	} else if(m.equalsIgnoreCase("november")){
		monthNumber = 11;
	} else if(m.equalsIgnoreCase("december")){
		monthNumber = 12;
	} else {
		monthNumber = 1;
	}
}
// Accept int argument set to setMonthNumber method
public void setMonthNumber(int m) {
	// Assign to monthNumber field
	this.monthNumber = m;
	// If value not between 1 and 12 set to 1
	if(monthNumber < 1 || monthNumber > 12){
		this.monthNumber = 1;
	}
}
// Create getMonthNumber method
public int getMonthNumber() {
	return monthNumber;
}
// Return name of the month based on monthNumber
public String getMonthName() {
	String name;
	switch (monthNumber) {
	case 1:
		name = "January";
		break;
	case 2:
		name = "Febuary";
		break;
	case 3:
		name = "March";
		break;
	case 4: 
		name = "April";
		break;
	case 5:
		name = "May";
		break;
	case 6:
		name = "June";
		break;
	case 7:
		name = "July";
		break;
	case 8:
		name = "August";
		break;
	case 9:
		name = "September";
		break;
	case 10:
		name = "October";
		break;
	case 11:
		name = "November";
		break;
	case 12:
		name = "December";
		break;
	default:
		name = "Unknown";
	}
	return name;
}
// return same value as getMonthName
public String toString() {
	return getMonthName();
}
// Compare objects
public boolean equals(Month month2) {
	boolean status;
	
	if (month2.getMonthNumber() == monthNumber)
		status = true;
	else
		status = false;
	
	return status;
}
// Compare if greater than
public boolean greaterThan(Month month2) {
	boolean status;
	
	if (monthNumber > month2.getMonthNumber())
		status = true;
	else
		status = false;
	
	return status;
}
// Compare if less than
public boolean lessThan(Month month2){
	boolean status;
	
	if (monthNumber < month2.getMonthNumber())
		status = true;
	else
		status = false;
	
	return status;
}

}

