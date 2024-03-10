class MobileAccessoriesTester{

public static void main(String[] accessories)
{
	MobileAccessories.addAccessories("Tempered glass");
	MobileAccessories.addAccessories("connectors");
	MobileAccessories.addAccessories("hand and waist pouches");
	MobileAccessories.addAccessories("earbud cases");
	MobileAccessories.addAccessories("wired earphones");
	MobileAccessories.addAccessories("adapter");
	MobileAccessories.addAccessories("tripod stand");
	MobileAccessories.addAccessories("selfie stick");
	MobileAccessories.addAccessories("gimbals");
	MobileAccessories.addAccessories("usb otg cable");

	MobileAccessories.getAccessories();
	boolean isMobileAccessoriesAdded = MobileAccessories.updateAccessories("Bluetooth","Tempered glass");

	MobileAccessories.getAccessories();
	MobileAccessories.deleteAccessories("connectors");	
	MobileAccessories.getAccessories();
}
}