
import java.util.*;

/**
 * Favourite class to test a string object and it's methods.
 * 
 * @version 1.0 15/03/22
 */

public class WrappedUp
{
	
	public void guessMyFavouriteThing()
	{
	   //Create a string object with your favourite animal, car ..whatever
	   //e.g String favMotorBikeManufacturer = "bmw"
		String faveFlower = "daisy";
	   /* Now prompt for a guess - using the Scanner class
	   ** Using String methods, you should give the length 
	   ** and first letter of your favourite thing in the prompt.
	   */

		String guess;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("What is my favourite flower?");
			guess = sc.nextLine();

		  // Now test if the guess was correct - ignore case 
			if (guess.equalsIgnoreCase(faveFlower))
			{
				System.out.println("That's right! It's a " + faveFlower + ".");
			} else {

				System.out.println("That's not right!\nHint: It begins with a \"" + faveFlower.substring(0,1) + "\"" + " and is " + faveFlower.length() + " characters long.");
			}
		} while (!(guess.equalsIgnoreCase(faveFlower)));
	
	}//end guessing

	public static void main(String args[]) {
		//Create WrappedUp object and test the methods
		WrappedUp flower = new WrappedUp();
		flower.guessMyFavouriteThing();
	}
}
