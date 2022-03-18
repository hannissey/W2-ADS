import java.util.*;

/**
 * A program that collects information from user to determine a healthy lifestyle or not.
 * 
 * @author Hannah Clarke 
 * @version 2.0 14/03/2022
 */
public class Person
{
	double cmHeight;
	double kgWeight;
	boolean smoker = true;
	int weeklyAlcholUnits; // 1 pint = 2 units, 1 short = 1 unit)
	final int RWAL = 21;   //RWAL - Recommended Weekly Alcohol Limit
	int restPulse;
	double bmi = 0;
	char sex = 'x';
	
	public void createPerson()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to your Health Profile!" + "\nPlease enter details."
		+ "\nGender: (please put m, f or x): ");
		sex = sc.next().charAt(0);
		System.out.println("Height (cm):");
		cmHeight = sc.nextDouble();
		System.out.println("Weight (kg):");
		kgWeight = sc.nextDouble();
		System.out.println("Do you smoke? Y or N");
		char temp = sc.next().charAt(0);
			if (temp == 'y' || temp == 'Y')
			{
				smoker = true;
			}
			else
			{
				smoker = false;
			}
		System.out.println("How many units of alcohol do you consume weekly?" 
			+ "\n1 pint = 2 units, 1 short = 1 unit");
		weeklyAlcholUnits = sc.nextInt();
		System.out.println("Resting pulse:");
		restPulse = sc.nextInt();
		System.out.println("Thank you.");
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
	   System.out.println("\n\n\t………Health Profile……");
	   
	   System.out.println("\n\tGender: " + sex
		  + "\n\tHeight:" + cmHeight
		  + "\n\tWeight: " + kgWeight
		  + "\n\tSmoker: " + smoker
		  + "\n\tWeekly Alcohol Units: " + weeklyAlcholUnits
		  + "\n\tResting Pulse: " + restPulse
		  + "\n\tBMI: " + getBMI()
		  + "\n\tStatus: According to your BMI, you are " + bmiStatus()
	  );
	  
	   
	   System.out.println("\tHealthy pulse check = " + checkPulse());
	   System.out.print("\tAbusing Body = " + checkAbuser());
	   
	}
	
	public double getBMI()
	{
		// A person weighing 95.3 kilograms and 182.9 centimeters tall would have a 
		// BMI = 95.3kg divided by (182.9cm x 182.9cm) x 10,000 = 28.5
		
		bmi = ( kgWeight / (cmHeight * cmHeight)) * 10000;
		return bmi;
	}
	
	public String bmiStatus()
	{
		String status = "unknown";
		// output health condition dependent on BMI
		if (sex == 'f')
		{
			if(bmi < 17.5)
			{
				status = "Anorexic";
			} 
			else if(bmi < 19.1)
			{
				status = "Underweight";
			}
			else if(bmi < 25.8)
			{
				status = "Normal";
			}
			else if(bmi < 27.3)
			{
				status = "Marginally overweight";
			}
			else if(bmi <= 32.3)
			{
				status = "Overweight";
			}
			else if(bmi >= 32.3)
			{
				status = "Very overweight or obese";
			}
		} // end female BMI status
		else
		{
			if(bmi < 17.5)
			{
				status = "Anorexic";
			} 
			else if(bmi < 20.7)
			{
				status = "Underweight";
			}
			else if(bmi < 26.4)
			{
				status = "Normal";
			}
			else if(bmi < 27.8)
			{
				status = "Marginally overweight";
			}
			else if(bmi <= 31.1)
			{
				status = "Overweight";
			}
			else if(bmi >= 31.1)
			{
				status = "Very overweight or obese";
			}
		}
		return status;

	}
	
	
}
