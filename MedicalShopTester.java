class MedicalShopTester{

public static void main(String[] items)
{
	MedicalShop.addItems("adderall ");
	MedicalShop.addItems("leqvio");
	MedicalShop.addItems("ativan");
	MedicalShop.addItems("lyrica");
	MedicalShop.addItems("melatonin");
	MedicalShop.addItems("bunavali");
	MedicalShop.addItems("naloxone");
	MedicalShop.addItems("otezla");
	MedicalShop.addItems("plan b");
	MedicalShop.addItems("farxiga");

	
	MedicalShop.getItems();
	boolean isItemsAdded = MedicalShop.updateItems("dettol","adderall");
	MedicalShop.getItems();
	MedicalShop.deleteItems("lyrica");
	MedicalShop.getItems();

}
}