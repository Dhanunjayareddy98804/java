class SwiggyTester{
public static void main(String foodItem[]){
	double price = Swiggy.search("Idli");
	System.out.println("foodItem is Idli:" + price);
		
	double priceWithQuantity = Swiggy.search("Idli",3);
	System.out.println("the price of 3 Idli is:" + priceWithQuantity);

}
}