
/**
 * Class to demonstrate Arrays, using JTextArea and 
 * a review of running programs as stand-alone apps
 * 
 * 
 */

import javax.swing.*;

public class BirdTable {

   // main method begins execution of Java application
   public static void main( String args[] )
   {
	   
      //Declare and build an array interactively - see the Temperature Project
	   int[] birdCount;
	   
	   String input;
	   int days = 0;

	   input = JOptionPane.showInputDialog("How many days would you like to record?");
	   days = Integer.parseInt(input);
	   
	   birdCount = new int[days];
	   
	   BirdTable backGarden = new BirdTable(); 
	   
	   
	   String birdy = backGarden.setBirdType();
	   backGarden.recordBirds(birdCount, birdy);
	   
      
      //Display Output using a histogram of '*' - see Histogram Project
	   // Our title
	   String rowOutput = "Day\tNo of " + birdy + "s\tHistogram";
	   
	   // for each day, output a bar in the Histogram 'column'
	   for (int day = 0; day < birdCount.length; day++)
	   {
		   rowOutput += "\n" + (day+1) + "\t" + birdCount[day] + "\t";
		   
		   // print the asterisks
		   for (int star = 0; star < birdCount[day]; star++)
		   {
			   rowOutput += "*";
		   }
	   }
	   
	   // create JTextArea object to display results
	   JTextArea results = new JTextArea();
	   results.setText("Back Garden Bird Table\n" + rowOutput);
	   
	      JOptionPane.showMessageDialog( null, results,
	    	 "BirdWatch Results",JOptionPane.INFORMATION_MESSAGE );
   }
   
   
   public String setBirdType()
   {
	   String birdOut;
	   birdOut = JOptionPane.showInputDialog("What type of bird would you like to record?");
	   return birdOut;
   }
   
   public void recordBirds(int[] arrayIn, String birdyIn)
   {
       String strElement;
       int intElement;
	   
	   int[] arrayOut = arrayIn;
	   
	   for(int i = 0; i < arrayOut.length; i++)
	   {
		   strElement = JOptionPane.showInputDialog("Please input how many " + birdyIn + "s you saw on Day " + (i+1));
		   intElement = Integer.parseInt(strElement);
		   arrayOut[i] = intElement;  
	   }
   }
}