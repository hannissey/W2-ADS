
public class TestCar {

	public static void main(String[] args) {
		//Create Car object and text car methods 
		Car mondeo = new Car();
		
		mondeo.setReg("REG PLATE");
		mondeo.setMake("Ford");
		mondeo.setPrice(2000);
		
		mondeo.displayCarDetails();
	}

}
