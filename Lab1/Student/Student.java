/**
   Class:   Student
   Author:  Kollings // adapted by Hannah Clarke
   Date:    June 2002 // March 2022 (20 years after!!)
   Purpose: The use of Strings as attributes, parameters and return value
   Comments:
 */

public class Student
{
   
   // the student's full name
	private String name;
	// the student ID
	private String id;
	// the amount of credits for study taken so far
	private int credits;
	
	// cheating a little - created a constructor to make it easier to create a Student object
//	public Student(String nameIn, String idIn, int creditsIn)
//	{
//		name = nameIn;
//		id = idIn;
//		credits = creditsIn;
//	}

	/**
	 * Methods to set student details 
	 */
	public void setName(String nameIn)
	{
		name = nameIn;
	}
     
    public void setID(String idIn)
    {
       id = idIn;   
    }

    public void setCredits(int creditsIn)
    {
      credits = creditsIn ;  
    }

	/**
	 * Return the full name of this student.
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Set a new name for this student.
	 */
	public void changeName(String replacementName)
	{
		name = replacementName;
	}

	/**
	 * Return the student ID of this student.
	 */
	public String getStudentID()
	{
		return id;
	}

	/**
	 * Add some credit points to the student's accumulated credits.
	 */
	public void addCredits(int additionalPoints)
	{
		credits += additionalPoints;
	}

	/**
	 * Return the number of credit points this student has accumulated.
	 */
	public int getCredits()
	{
		return credits;
	}

	/**
	 * Print the student's name and ID number to the output terminal.
	 */
	public void printDetails()
	{
		System.out.println(name + " (" + id + ")");
		System.out.println("Credits = "+credits);
	}
     public void incCredits(int increase)
    {
      /* Purpose:  Increments the number of credits by 'increase'
         Receives: An integer increase
      */    
       credits = credits + increase;
    }

}
