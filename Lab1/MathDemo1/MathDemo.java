
/**
 * To demonstrate some methods found in the Math class.
 * 
  */
import java.util.*;
public class MathDemo
{
	
	
	public double squareRoot(double rootIn)
	{
	 return  Math.sqrt(rootIn);
	}
	
	public void  rollDice()
	{
	   int score;
	   score = (int) (Math.random() * 6) + 1;
	   System.out.println("You rolled a " + score);
	}
	
	public void findThePower()
	{
	   double base, exponent;
	   System.out.println("Enter a number you wish to raise to the power");
	   base = EasyScanner.nextDouble();
	   System.out.println("Enter the power you wish to raise the number to");
	   exponent = EasyScanner.nextDouble();
	   System.out.print("The number " + base + " raised to the power " + exponent + " = ");
	   System.out.println(Math.pow(base,exponent));
	}
	
	public int generateLottoNumber()
	{
		// returns a random number from 1 to 99
		int lotto = (int) (Math.random() * 99) + 1;
		return lotto;	
	}
	
	public int returnMax(int num1, int num2, int num3)
	{
		int highest = num1;
		if(num1 > num2)
		{
			highest = num1;
		}
		else if (num2 > num3)
		{
			highest = num2;
		}
		else if(num3 > num1)
		{
			highest = num3;
		}
		return highest;
	}
	
	public void bestOfThree()
	{
		int num1, num2, num3, result;
		
		System.out.println("We're going to work out the highest of 3 numbers using methods.");
		System.out.print("Please enter your first integer:");
		num1 = EasyScanner.nextInt();
		System.out.print("Your second:");
		num2 = EasyScanner.nextInt();
		System.out.print("And third:");
		num3 = EasyScanner.nextInt();
		result = returnMax(num1, num2, num3);
		System.out.println("The highest number is " + result);
		
	}
}
