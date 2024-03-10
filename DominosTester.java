class DominosTester{
public static void main(String foodItem[]){
	double price = Dominos.search("farmhouse pizza");
	System.out.println("foodItem is farmhouse pizza:" + price);
		
	double priceWithQuantity = Dominos.search("farmhouse pizza",8);
	System.out.println("the price of 8 farmhouse pizza is:" + priceWithQuantity);

}
}