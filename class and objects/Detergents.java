class Detergents{
	
	String brandName;
	double price;
	String form;
	String quantity;
	
	public Detergents(String brName,double pce, String fo, String quan){
	System.out.println("object is created");
	brandName  	  = brName;
	price     	  = pce;
	form      	  = fo;
	quantity      = quan;
	}


	public void neat(){
	System.out.println("nice smell");
	}


	public void displayInfo(){
	System.out.println("detergents info before init");
	System.out.println("detergent brnd is :" + brandName);
	System.out.println("detergent price is:" + price);
	System.out.println("detergent form is" + form);
	System.out.println("detergent quantity is:" + quantity);
	System.out.println("detergents info after init");


	}
}