class AutoMobileShopTester{

public static void main(String[] parts)
{
	AutoMobileShop.addPartItems("engine");
	AutoMobileShop.addPartItems("cylinder");
	AutoMobileShop.addPartItems("pistons");
	AutoMobileShop.addPartItems("crankshaft");
	AutoMobileShop.addPartItems("exhaust");
	AutoMobileShop.addPartItems("clutch");
	AutoMobileShop.addPartItems("brakes");
	AutoMobileShop.addPartItems("headlights");
	AutoMobileShop.addPartItems("indicators");
	AutoMobileShop.addPartItems("ignition");

	
	AutoMobileShop.getPartItem();
	boolean isPartItemsAdded = AutoMobileShop.updatePartItems("horn","engine");
	AutoMobileShop.getPartItem();
	AutoMobileShop.deletePartItems("brakes");
	AutoMobileShop.getPartItem();

}
}