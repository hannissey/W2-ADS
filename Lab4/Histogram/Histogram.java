
/**
 * Class to demonstrate Arrays, using JTextArea and 
 * a review of running programs as stand-alone apps
 */

import javax.swing.*;

public class Histogram {


   // main method begins execution of Java application
   public static void main( String args[] )
   {
      //Build an array.
      int hArray[] = { 1,2,3,4,5,6,7,8,9 };

     //String to hold output
      String output = "Element\tValue\tHistogram";

      // for each array element, output a bar in histogram
      for ( int counter = 0; counter < hArray.length; counter++ ) {
         output += 
            "\n" + counter + "\t" + hArray[ counter ] + "\t";

         // print bar of asterisks
         for ( int stars = 0; stars < hArray[ counter ]; stars++ )
            output += "H";
      }
      //Create a new text area object to hold the text
      JTextArea outputArea = new JTextArea();
      outputArea.setText( "Hannah's Histogram\n" + output );

      JOptionPane.showMessageDialog( null, outputArea,
         "Histogram Printing Program",JOptionPane.INFORMATION_MESSAGE );

   }
}