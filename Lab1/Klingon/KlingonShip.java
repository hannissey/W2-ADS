import java.util.Scanner;

/**
 * AlienShip - Unit 4 exercise.
 * 
 * @author Hannah Clarke
 * @version 1.0 14/3/22
 */
public class KlingonShip
{
	double photonPower = 45;
	int threatFactor = 7;
	double cosmicProximity = 20.6;
	double dangerLevel = 0;
	
	//Put the displayKlingonDetails()and getDangerLevel() methods below.
	
	public void displayKlingonDetails()
	{
		System.out.print("**** Klingon Ship Details ****"
				+ "\n\tPhoton Power = " + photonPower
				+ "\n\tThreat Factor = " + threatFactor
				+ "\n\tCosmic Proximity = " + cosmicProximity
				+ "\n\tDanger Level = " + getDangerLevel()
				);
	}
	
	public double getDangerLevel()
	{
		return dangerLevel = (photonPower * threatFactor)/cosmicProximity;
	}
	
	public void promptSettings()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n*** New Ship Detail Input ***");
		System.out.println("Please enter details:\nPhoton power:");
		photonPower = sc.nextDouble();
		System.out.println("Threat factor:");
		threatFactor = sc.nextInt();
		System.out.println("Cosmic proximity:");
		cosmicProximity = sc.nextDouble();
		//System.out.println("Danger level:");
		//dangerLevel = sc.nextDouble();
	
	}
	

	
	
	
}
