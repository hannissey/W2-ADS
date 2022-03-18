class Car
{
    String registration;
    String make;
    double price;
    
    //Methods to set car details below here
    public void setReg(String regIn)
    {
    	registration = regIn;
    }
    
    public void setMake(String makeIn)
    {
    	make = makeIn;
    }
    
    public void setPrice(double priceIn)
    {
    	price = priceIn;
    }
    
    //displayCarDetails()
    public void displayCarDetails()
    {
    	System.out.print("**** Car Details ****"
    			+ "\n\t" + "Registration: " + registration
    			+ "\n\t" + "Make: " + make
    			+ "\n\t" + "Price: £" + price
    			);
    }
    
    
    //Try out these 'getter' methods after you have set info.
    public String getRegistration()
    {
       return registration;
    }
    
    public String getMake()
    {
        return make;
    }

    public double getPrice()
    {
        return price;
    }
}


