
/**
 * Course tests the class Student.java.
 * Here we have fixed a syntax error which tried to access the name of the class object directly.
 * 
 * @author Hannah Clarke
 * @version 1.0 15/03/22
 */
public class Course
{  
   public static void main (String args[])
   {
	   Student s=new Student("12345","Tommy");
	   
	   //External access to a private attribute in Student class is not allowed
	   //You should note it is a syntactical error
	   //System.out.println(s.name);
	   
	   //You should access via public method
	   System.out.println(s.getName());
   }

}
    
   