class Clock{
	
	String brandName;
	double price;
	String color;
	String style;
	
	public Clock(String brName,double pce, String col , String syl){
	System.out.println("object is created");
	brandName = brName;
	price     = pce;
	color     = col;
	style     = syl;
	}


	public void home(){
	System.out.println("for home");
	}


	public void displayInfo(){
	System.out.println("clocks info before init");
	System.out.println("clock brnd is :" + brandName);
	System.out.println("clock price is:" + price);
	System.out.println("clock color is" + color);
	System.out.println("clock style is:" + style);
	System.out.println("clocks info after init");


	}
}