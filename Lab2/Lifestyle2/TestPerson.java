
public class TestPerson {

	public static void main(String[] args) {
		// Create Person object and test the methods

		Person harold = new Person();
		
		harold.setBirthday(12, 4, 1976);
		harold.setName("Harold");
		
		harold.displayProfile();
	}

}
