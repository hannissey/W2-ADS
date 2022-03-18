
public class FlowerTest {

	public static void main(String[] args) {
		// Create 4 different flowers using the different constructors

		   	// Constructor taking 1 parameter for petals
		   	//Flower(int petalCountIn) 
			Flower sunflower = new Flower(12);
		
		   	//Constructor taking name as parameter
	    	//Flower(String nameIn) 
			Flower daisy = new Flower("daisy");
		
		   	//Both parameters passed to the constructor
	    	//Flower(String nameIn, int petalCountIn) 
			Flower rose = new Flower("rose",20);
		
		   	//Default constructor - no args
	    	//Flower() 
			Flower lily = new Flower();
			
			System.out.println("A " + sunflower.getFlowerName() + " has " + sunflower.getPetalCount() + " petals.");
			System.out.println("A " + daisy.getFlowerName() + " has " + daisy.getPetalCount() + " petals.");
			System.out.println("A " + rose.getFlowerName() + " has " + rose.getPetalCount() + " petals.");
			System.out.println("A " + lily.getFlowerName() + " has " + lily.getPetalCount() + " petals.");
			
	}
	
}
