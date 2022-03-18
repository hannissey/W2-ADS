
// import ArrayList package so we can use ArrayList
import java.util.ArrayList;
import javax.swing.*;

public class Shopping {
	
	// array of menu items
	// this is an array which creates the buttons on the app
	// when a user selects a button, it returns the index value as a choice to run App()
	private String menu[] = {"Show List", "Add Item to List", "Show particular item", "Quit"};

	// Add a ArrayList class called shoppingList (a collection of Strings)
	// as an attribute of the Shopping class.
	ArrayList shoppingList;
	
	// constructor - so shoppingList  references a new ArrayList object
	public Shopping()
	{
		shoppingList = new ArrayList();
	}

	// addItem(String celeb)- to add an item to the shopping list
		public boolean addItem(String itemIn)
		{
			shoppingList.add(itemIn);
			return true;
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
			
			// use JTextArea to display the list (showMessageDialog displays them individually)
			JTextArea entireList = new JTextArea();
			entireList.setText("My List:\n" + shoppingList);
			JOptionPane.showMessageDialog(null, entireList, "Your Shopping List", JOptionPane.PLAIN_MESSAGE);
			
			
		}
		
	// run the app
		public void runApp()
		{
			int choice = getChoice();
			
			// run loop while Quit is not selected
			// as Quit will always be the last option, use code rather than fixed value
			while (choice !=(menu.length-1))
			{

				// show the list
				if (choice == 0)
					if (numberOfItems() == 0)
					{
						JOptionPane.showMessageDialog(null, "There are no items in the list. Please select \"Add Item\" from the menu to add an item!");
					}
					else 
					{
						listItems();
					}

				// add an item to the list
				else if (choice == 1)
				{					
					String newItem = JOptionPane.showInputDialog(null, "Enter item", "Add to Shopping List", JOptionPane.PLAIN_MESSAGE);
					boolean success = addItem(newItem);
					if (success) JOptionPane.showMessageDialog(null, "Item added successfully.", "Success!", JOptionPane.INFORMATION_MESSAGE);	
				}
				
				else if(choice == 2)
				{
					String input = JOptionPane.showInputDialog(null, "Enter number of item:", "View List Item", JOptionPane.INFORMATION_MESSAGE);
					int i = Integer.parseInt(input);
					if (i > numberOfItems())
					{
						JOptionPane.showMessageDialog(null, "Invalid input, there are only " + numberOfItems() + " in list.");
					}
					else
					{
						JOptionPane.showMessageDialog(null, showItem(i));
					}
					
					
				}

				choice = getChoice();
			}//end while
			
		}
		
		
	// show app dialogue box with menu choices	
	public int getChoice()
	{
		int choice = JOptionPane.showOptionDialog(null, "Make your new shopping list:", "Hannah's Shopping List App",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menu, menu[0]);
		return choice;
		
	}
}
