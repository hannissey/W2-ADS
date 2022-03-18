/* To demonstrate the use of arrays
 * a
*/

import javax.swing.JOptionPane;  // import class JOptionPane, for graphical input
import javax.swing.JTextArea;

public class Temperature{
   
   //1. Create a reference to an array (of doubles) called temperature
   double  [ ]  temperature;
   //The array could have been created and populated by the following line
   //  double [ ] temperature = {9, 11.8, 18, 12.7};
   
   public Temperature()
   {
     //2. Allocate memory to store the array  
       temperature = new  double[4]; 
 }
   
   public void basicArrayAccess()
   {   
     //3. Populate the array
      temperature[0] = 9;
      temperature[1] = 11.8;
      temperature[2] = 18;
      temperature[3] = 12.7;
     
      //Output 2nd element
      System.out.println("Second element =  " + temperature[1]);
      //Try uncommenting the line below - what happens
      //System.out.println("Seventh element =  " + temperature[7]);
      
      if (temperature[3] >=18) //Checks if the 4th day is hot
      {
          System.out.println("4th day is hot");
      }
      else 
      {
        System.out.println("4th day is cold");
      }
      
      //output all 4 temperatures
      for (int i = 0 ; i < temperature.length ; i++)
      {
        System.out.println("Element at position " + i + " = " + temperature[i]);
      }
      
     }//End basic array access
     
     public void interactiveArray()
     {
       
       String strElement;
       double doubElement;
       //Enter the temperatures using inputDialog and a loop
       for (int i = 0; i < temperature.length; i++)
       {
         strElement = JOptionPane.showInputDialog( "Enter temperature "+(i+1) );
         doubElement = Double.parseDouble(strElement );
         temperature[i] = doubElement;
        }
       //output all temperatures
        System.out.println("TEMPERATURES ENTERED");
        for (int i = 0 ; i < temperature.length ; i++)
        {
         System.out.println("Temp at position " + i + " = " + temperature[i]);
        }
      }
     
     public void showHistogram()
     {
 		//String to hold output
	      String output = "Element\tValue\tHistogram";

	      // for each array element, output a bar in histogram
	      for ( int counter = 0; counter < temperature.length; counter++ ) {
	         output += 
	            "\n" + counter + "\t" + temperature[ counter ] + "\t";

	         // print bar of asterisks
	         for ( int stars = 0; stars < temperature[ counter ]; stars++ )
	            output += "H";
	      }
	      //Create a new text area object to hold the text
	      JTextArea outputArea = new JTextArea();
	      outputArea.setText( "Hannah's Histogram\n" + output );

	      JOptionPane.showMessageDialog( null, outputArea,
	         "Histogram Printing Program",JOptionPane.INFORMATION_MESSAGE );
     }
   
    
}
