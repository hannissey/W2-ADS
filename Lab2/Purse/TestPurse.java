
public class TestPurse {

	public static void main(String[] args) {
		//Create a purse and some coins, then add the coins to the purse, 
		//and finally work out the total in the purse
		
		Purse hannahPurse = new Purse();
		
		// create coins
		Coin onePence = new Coin(0.07);
		Coin tenPence = new Coin(0.10);
		Coin fiftyPence = new Coin(0.50);
		Coin pound = new Coin(1.00f);
		
		// add coins requires 2 parameters: number of coins and type 
		hannahPurse.addCoins(5, onePence);
		hannahPurse.addCoins(3, tenPence);
		hannahPurse.addCoins(2, fiftyPence);
		hannahPurse.addCoins(5, pound);
		
		System.out.println("Total amount in my purse is £" + hannahPurse.getTotal());


	}

}
