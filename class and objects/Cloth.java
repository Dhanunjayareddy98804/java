class Cloth{
	
	String brandName;
	String material;
	double price;
	String size;
	String color;
	String type;
	
	public Cloth(String brName,String mrl , double pce ,String si , String col , String typ){
	System.out.println("object is created");
	brandName = brName;
	material = mrl;
	price = pce;
	size = si;
	color = col;
	type = typ;
	}


	public void desgining(){
	System.out.println("desgining cloths");
	}


	public void displayInfo(){
	System.out.println("cloth info before init");
	System.out.println("cloth brnd is :" + brandName);
	System.out.println("cloth material is:" + material);
	System.out.println("cloth price is:" + price);
	System.out.println("cloth size is:" + size);
	System.out.println("cloth color is" + color);
	System.out.println("cloth type is:" + type);
	System.out.println("cloths info after init");


	}
}