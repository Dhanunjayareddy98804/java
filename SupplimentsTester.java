class SupplimentsTester{

public static void main(String[] items)
{
	System.out.println("shop address is:" + Suppliments.address);
	Suppliments.addItems("vitamin b12");
	Suppliments.addItems("360 gut");
	Suppliments.addItems("cabamide forte");
	Suppliments.addItems("monohydreate powder");
	Suppliments.addItems("groviva");
	Suppliments.addItems("probotics gut");
	Suppliments.addItems("healthy-U");
	Suppliments.addItems("BCAA powder");
	Suppliments.addItems("aura nutrition");
	Suppliments.addItems("wellbeing");

	
	Suppliments.getItems();
	boolean isItemsAdded = Suppliments.updateItems("vitamin c","vitamin b12");
	Suppliments.getItems();
	Suppliments.deleteItems("360 gut");
	Suppliments.getItems();

}
}