/**
   Class:   Parameter Test
      Purpose: To illustrate how a parameters is copied, leaving the original unchanged 
      
      Modified by Hannah Clarke 14/3/22 "and some amendments by me to show how methods, if returning a 
      value and reassigned to the original variable demonstrates how the method value overrides the original"
   
 */

public class ParameterTest 
{
	int original = 10;

     //Please note that I put the main and class under test in one class
     public static void main(String args[]) {
    	 
    	 int original2 = 10;

    	 ParameterTest t=new ParameterTest();
    	 t.beforeAndAfter();
    	 
    	 ParameterTest x = new ParameterTest();
    	 
    	 System.out.println("\nNow we see what happens when we assign a method that returns a data type to "
    	 		+ "\nthe variable - it overrides the orginal value and replaces it with the method's return value.");
    	 System.out.println("The variable original2 which we pass to the method was " + original2);
    	 original2 = t.treble2(original2);
    	 System.out.println("original2 is now = " + original2);
    	 
     }
     
     public void beforeAndAfter()
     {
       // Purpose:  To create and display a parameter, before and after it is passed to a method
       
       System.out.println("Value before = "+ original);
       
       //Call the 'treble method' 
       treble(original);
       System.out.println("Value after = "+ original);
       System.out.println("Should be unchanged by the method call. i.e we are just passing a copy of "+original + " to the method.");
     }   
   
     public void treble(int origIn)
     { 
     /* Purpose:  To receive and amend a parameter
        Receives: integer - a copy of the original value
     */ 
        origIn = origIn * 3;
        System.out.println("Value inside treble= "+ origIn);
        
     }
     
     public int treble2(int origIn)
     {
    	 origIn = origIn * 5;
    	 return origIn;
     }

}
