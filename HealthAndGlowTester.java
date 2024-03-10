class HealthAndGlowTester{

public static void main(String[] items)
{
	System.out.println("shop address is:" + HealthAndGlow.address);
	HealthAndGlow.addItems("lakme");
	HealthAndGlow.addItems("lorela");
	HealthAndGlow.addItems("lotus");
	HealthAndGlow.addItems("biotique");
	HealthAndGlow.addItems("mamaearth");
	HealthAndGlow.addItems("sugar");
	HealthAndGlow.addItems("garnier");
	HealthAndGlow.addItems("olav");
	HealthAndGlow.addItems("dermafique");
	HealthAndGlow.addItems("maybelline");

	
	HealthAndGlow.getItems();
	boolean isItemsAdded = HealthAndGlow.updateItems("lipstick","lakme");
	HealthAndGlow.getItems();
	HealthAndGlow.deleteItems("olav");
	HealthAndGlow.getItems();

}
}