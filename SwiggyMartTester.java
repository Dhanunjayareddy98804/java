class SwiggyMartTester{
public static void main(String foodItem[]){
	double price = SwiggyMart.search("custerd apple");
	System.out.println("foodItem is custerd apple:" + price);
		
	double priceWithQuantity = SwiggyMart.search("custerd apple",4);
	System.out.println("the price of 2 custerd apple is:" + priceWithQuantity);

}
}