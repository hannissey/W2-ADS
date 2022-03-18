
public class ShoppingListMaker {
	
	public static void main(String[] args)
	{
		Shopping sainsburys = new Shopping();
		sainsburys.addItem("milk");
		sainsburys.addItem("bread");
		sainsburys.addItem("orange juice");
		sainsburys.addItem("biscuits");
		System.out.println("The list is " + sainsburys.numberOfItems() + " items long.");
		System.out.println("The first item in the list is: " + sainsburys.showItem(0));
		System.out.println("\nSHOPPING LIST");
		sainsburys.listItems();
	
	}
}
