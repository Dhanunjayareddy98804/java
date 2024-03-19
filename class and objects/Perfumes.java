class Perfumes{
	
	String brandName;
	String targetGender;
	double price;
	String form;
	String volume;
	
	public Perfumes(String brName,String tgr , double pce, String fo, String vol){
	System.out.println("object is created");
	brandName  	  = brName;
	targetGender  = tgr;
	price     	  = pce;
	form      	  = fo;
	volume        = vol;
	}


	public void smell(){
	System.out.println("nice smell");
	}


	public void displayInfo(){
	System.out.println("perfumes info before init");
	System.out.println("perfume brnd is :" + brandName);
	System.out.println("perfume targetGender is:" + targetGender);
	System.out.println("perfume price is:" + price);
	System.out.println("perfume form is" + form);
	System.out.println("perfume volume is:" + volume);
	System.out.println("perfumes info after init");


	}
}