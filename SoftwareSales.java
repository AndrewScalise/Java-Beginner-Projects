package chapter4;

/** This class stores the number of units sold and
 * calculates the total cost of the purchase.
 *
 */

public class SoftwareSales 
{
	private int sold;				// Number of units sold
	private double discount;		// Discount based on units sold
	private double retail;          // Cost of units sold
	private double total;           // Calculate total with discount
	private double discountAmount;	// Shows discount dollar value
	
	/** The constructor uses two parameters to accept
	 * arguments: s. The value in s is assigned
	 * to the sold field. The calculateTotal method
	 * is called.
	 */
	
	public SoftwareSales(int s)
	{
		sold = s;
		calculateTotal();
	}
	
	/**
	 * The setDiscount method sets the discount 
	 * based on the amount of units sold.
	 * This method is called from the
	 * calculateTotal method
	 */
	
	private void setDiscount()
	{
		if (sold < 10)
			discount = 0;
		else if (sold < 20)
			discount = .20;
		else if (sold < 50)
			discount = .30;
		else if (sold < 100)
			discount = .40;
		else
			discount = .50;
	}
	
	/** The calculateTotal method calculates the discount amount
	 * and the total amount of the sale.
	 */
	
	private void calculateTotal()
	{
		setDiscount();
		retail = sold * 99;
		discountAmount = discount * retail;
		total = (retail)-(discountAmount);
		
	}
	
	/**
	 * The getTotal method returns the total field.
	 */
	
	public double getCost()
	{
		return total;
	}
	
	/**
	 * The getSold method return the sold field
	 */
	
	public int getUnitsSold()
	{
		return sold;
	}
	
	/**
	 * The getDiscount method returns the discount field
	 */
	
	public double getDiscount()
	{
		return discountAmount;
	}
	
}
