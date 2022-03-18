
/**
 * To demonstrate using different classes and using objects as data types and parameters.
 * 
 * @author Hannah Clarke
 * @version 1.0 16/03/22 another amended file can be found in W2 Lab1 - Lifestyle1
 */
public class Person
{
	double cmHeight;
	double kgWeight;
	boolean smoker = true;
	int weeklyAlcholUnits; // 1 pint = 2 units, 1 short = 1 unit)
	final int RWAL = 21;   //RWAL - Recommended Weekly Alcohol Limit
	int restPulse;
	YorDate birthday;
	String name = "noname";
	
	public void setName(String nameIn)
	{
		name = nameIn;
	}
	
	public void setBirthday(int dayIn, int monthIn, int yearIn)
	{
		YorDate dateOfBirth = new YorDate(dayIn, monthIn, yearIn);
		birthday = dateOfBirth;
	}

    public void setHeight(double heightIn)
    {
        cmHeight= heightIn;
    }
       
    public void setWeight(double weightIn)
    {
       kgWeight= weightIn;
    }
    
    public void setPulse(int pulseIn)
    {
        restPulse = pulseIn;
    }
    
    
	public boolean checkPulse()
	{
	   boolean healthyPulse;
	   healthyPulse = ((restPulse > 30) && (restPulse < 180));
	   return healthyPulse;
	}
	
	public boolean checkAbuser()
	{
	      boolean abuser ;
	      abuser = ((weeklyAlcholUnits > RWAL) || (smoker) );
	      return abuser;
	}
	
	public void displayProfile()
	{
	   System.out.println("………Health Profile……");
	   
	   System.out.print("Patient Name: " + name 
			   + "\nDate of Birth: " + birthday
			   );
	   
	   System.out.println("\nHealthy pulse check = " + checkPulse());
	   System.out.print("Abusing Body = " + checkAbuser());
	   
	}
	
	
}
