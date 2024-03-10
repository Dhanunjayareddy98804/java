class BehrouzTester{
public static void main(String foodItem[]){
	double price = Behrouz.search("gosht haleem");
	System.out.println("foodItem is gosht haleem:" + price);
		
	double priceWithQuantity = Behrouz.search("gosht haleem",4);
	System.out.println("the price of 1 gosht haleem is:" + priceWithQuantity);

}
}