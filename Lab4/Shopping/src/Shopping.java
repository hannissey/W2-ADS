
// import ArrayList package so we can use ArrayList
import java.util.ArrayList;

public class Shopping {

	// Add a ArrayList class called shoppingList (a collection of Strings)
	// as an attribute of the Shopping class.
	ArrayList shoppingList;
	
	// constructor - so shoppingList  references a new ArrayList object
	public Shopping()
	{
		shoppingList = new ArrayList();
	}

	// addItem(String celeb)- to add an item to the shopping list
		public void addItem(String itemIn)
		{
			shoppingList.add(itemIn);
		}

	// numberOfItems() - to return number of items on the list
		public int numberOfItems()
		{
			return shoppingList.size();
		}

	// showItem(int) - display item a given index
		public Object showItem(int indexIn)
		{
			return shoppingList.get(indexIn);
		}

	// listItems() - display items in the shopping list

		public void listItems()
		{
			for (Object item : shoppingList)
			{
				System.out.println(item);
			}
		}
	
}
