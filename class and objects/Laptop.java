class Laptop{
	
	String brandName;
	double price;
	String ram;
	String color;
	String type;
	
	public Laptop(String brName, double pce ,String ra , String col , String typ){
	System.out.println("object is created");
	brandName = brName;
	price     = pce;
	ram      = ra;
	color     = col;
	type      = typ;
	}


	public void product(){
	System.out.println("");
	}


	public void displayInfo(){
	System.out.println("cloth info before init");
	System.out.println("cloth brnd is :" + brandName);
	System.out.println("cloth price is:" + price);
	System.out.println("cloth ram is:" + ram);
	System.out.println("cloth color is" + color);
	System.out.println("cloth type is:" + type);
	System.out.println("cloths info after init");


	}
}