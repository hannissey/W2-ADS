// File: Test_YorDate.java
/**
 * Test harness for YorDate class
 *
 * @author	Tommy Yuan / modified Hannah Clarke
 * @version	24 January 2019 / 15/03/22
 */
 
public class Test_YorDate
{
	public static void main(String args[])
	{
		//Create a reference to a YorDate object
		YorDate date1;
			
	    // This creates an object which sets the date to the current date
		 date1 = new YorDate();
		 
		 // new object to test my new method and new constructor
		 YorDate date2 = new YorDate(23,12,1952);
		
		//Using the appropriate methods set, set date1 to your birthdate
		 date1.setDay(5);
		 date1.setMonth(10);
		 date1.setYear(1990);
		
		//Using appropriate date1 method(s) display your birthday
		 System.out.println("Your birthday is the " +
		 date1.getDay() + "/" + date1.getMonth() + "/" + date1.getYear()
		 + " which was a " +
		 date1.getDayOfWeek() + "."
		 );
		 
		 displayDate(date2);
			
	}
	
	// new method which prints out details easily
	public static void displayDate(YorDate dateIn)
	{
		YorDate date = dateIn;
		 System.out.println("Your birthday is the " +
		 date.getDay() + "/" + date.getMonth() + "/" + date.getYear()
		 + " which was a " +
		 date.getDayOfWeek() + "."
		 );
		
	}
}