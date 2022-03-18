import java.util.*;
public class BirdTableBasic {

   public static void main( String args[] )
   {
      //Declare and build an array interactively
       Scanner input = new Scanner(System.in);
       int bird[][] = new int[7][2];
       for (int i = 0; i < bird.length; i++) {
           System.out.println("please add the number of birds seen on day " + (i+1));
           bird[i][0] = (i+1);
           bird[i][1] = input.nextInt();
       }       
              input.close();
              
       System.out.println(); 
       
       //print the 2D array and display output using a histogram of '*'
       for (int row = 0; row < bird.length; row++) {
           for (int col = 0; col < bird[0].length; col++) {
               System.out.print(bird[row][col] + " ");
           }
           for (int j = 1; j < bird[row].length;j++) {
               for (int k = 1; k < bird[row][1];k++) {
                   System.out.print("*");
                }
            }
           System.out.println(); 
       }
   }
}