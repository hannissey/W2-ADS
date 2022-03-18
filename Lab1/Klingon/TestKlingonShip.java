
public class TestKlingonShip {

	public static void main(String[] args) {
		
		// Create LingonShip object, then test the methods
		KlingonShip theKronos = new KlingonShip();
		
		theKronos.displayKlingonDetails();
//		System.out.println("Danger Level = " + theKronos.getDangerLevel());
		
//		System.out.println("\nCalling getDangerLevel() method from within displayKlingonDetails() method:\n");
//		theKronos.displayKlingonDetails();
		
		KlingonShip starTrek = new KlingonShip();
		starTrek.promptSettings();
		
		starTrek.displayKlingonDetails();
	}

}
