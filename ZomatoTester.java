class ZomatoTester{
public static void main(String foodItem[]){
	double price = Zomato.search("Apple Juice");
	System.out.println("foodItem is Apple Juice:" + price);
		
	double priceWithQuantity = Zomato.search("Apple Juice",3);
	System.out.println("the price of 3 Apple Juice is:" + priceWithQuantity);

}
}