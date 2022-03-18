
public class TestMathDemo1 {

	public static void main(String[] args) {
		// Create MathDemo1 object and test the methods
		MathDemo lottery = new MathDemo();
		
		System.out.println("*** NATIONAL LOTTERY! ***");
		System.out.println("And our winning numbers are...");
		
		for (int i = 0; i < 6; i++) System.out.print(lottery.generateLottoNumber() + " "); 
		// work out code to prevent duplicate numbers
		
		System.out.println("\n\nWrite a method which accepts three integer parameters and returns the max\n");
		MathDemo compare = new MathDemo();
		System.out.println(compare.returnMax(30, 10, 20));
		
		System.out.println("\n\nWrite a bestOfThree() method, which should prompt the user for 3 integers.\n");
		MathDemo bestOf = new MathDemo();
		bestOf.bestOfThree();
		
	}
	


}
