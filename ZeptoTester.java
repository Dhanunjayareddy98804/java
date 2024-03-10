class ZeptoTester{
public static void main(String foodItem[]){
	double price = Zepto.search("orange");
	System.out.println("foodItem is orange:" + price);
		
	double priceWithQuantity = Zepto.search("orange",4);
	System.out.println("the price of 4 orange is:" + priceWithQuantity);

}
}