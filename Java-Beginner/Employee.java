package chapter3;

/**
 * The Employee class represents employees.
 *
 */

public class Employee 
{
	// Fields
	private String Name;
	private int IdNumber;
	private String Department;
	private String Position;
	
	
	
	/** 
	 * The setName method accepts an argument for the employee's name.
	 */
	
	public void setName(String n)
	{
		Name = n;
	}
	
	/**
	 * The setIdNumber method accepts an argument for the employee's ID.
	 */

	public void setIdNumber(int Id)
	{
		IdNumber = Id;
	}
	
	/**
	 * The setDepartment method accepts an argument for the employee's Department.
	 */
	
	public void setDepartment(String Dep)
	{
		Department = Dep;
	}
	
	/**
	 * The setPosition method accepts an argument for the employee's position.
	 */
	
	public void setPosition(String Pos)
	{
		Position = Pos;
	}
	
	/**
	 * The getName method returns the name of the employee.
	 */
	
	public String getName()
	{
		return Name;
	}
	
	/**
	 * The getIdNumber method returns the Id Number of the employee.
	 */
	
	public int getIdNumber()
	{
		return IdNumber;
	}
	
	/**
	 * The getDepartment method returns the Department of the employee.
	 */
	
	public String getDepartment()
	{
		return Department;
	}
	
	/**
	 * The getPosition method returns the Position of the employee.
	 */
	
	public String getPosition()
	{
		return Position;
	}
	
}


