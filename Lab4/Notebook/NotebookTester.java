
public class NotebookTester {

	public static void main(String[] args) {
		//Create Notebook objects and test the methods
		Notebook n=new Notebook();
		
		n.storeNote("Monday - attend symposium");
		n.storeNote("Tuesday - seminar at 1500");
		
		
		n.showNote(2);
		n.listNotes();

	}

}
