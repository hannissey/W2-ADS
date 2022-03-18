
public class TestBankAccount {

	public static void main(String[] args) {
		// Create BanAccount object and test the methods

		BankAccount acc1 = new BankAccount();
		
		acc1.availableForLoan(10000, 500);
		acc1.deposit(70);
		acc1.displayDetails();
	}

}
