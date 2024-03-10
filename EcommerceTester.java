class EcommerceTester{

public static void main(String[] products)
{
	System.out.println("shop address is:" + Ecommerce.address);
	Ecommerce.addProducts("mobile");
	Ecommerce.addProducts("neckband");
	Ecommerce.addProducts("watch");
	Ecommerce.addProducts("electric cycle");
	Ecommerce.addProducts("induction stove");
	Ecommerce.addProducts("ps5");
	Ecommerce.addProducts("bed");
	Ecommerce.addProducts("pillow");
	Ecommerce.addProducts("shirt");
	Ecommerce.addProducts("tablet");

	
	Ecommerce.getProducts();
	boolean isItemsAdded = Ecommerce.updateItems("bag","mobile");
 	Ecommerce.getProducts();
 	Ecommerce.deleteItems("shirt");
 	Ecommerce.getProducts();

}
}