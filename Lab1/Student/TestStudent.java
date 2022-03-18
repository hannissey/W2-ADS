
public class TestStudent {

	public static void main(String[] args) {
		// Create student objects and test the methods
//		Student student1 = new Student("Carrie Smith", "0123456", 70);
//		student1.printDetails();
		
		Student student1 = new Student();
		
		// Carrie has got married and changed her name, invoke the appropriate method to edit the record
		student1.changeName("Carrie Barrett");
		student1.printDetails();

	}

}
