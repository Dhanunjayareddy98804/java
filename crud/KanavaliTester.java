class KanavaliTester{

public static void main(String[] foodItems)
{
	Kanavali.addFoodItems("chole batoore");
	Kanavali.addFoodItems("rajma chawal");
	Kanavali.addFoodItems("chiken tikka");
	Kanavali.addFoodItems("chikken lollipop");
	Kanavali.addFoodItems("dum biriyani");
	Kanavali.addFoodItems("south indian thalli");
	Kanavali.addFoodItems("north indian thalli");
	
	Kanavali.getFoodItems();	
	boolean isFoodItemAdded = Kanavali.updateFoodItem("veg pepper masala","chole batoore");
	boolean isFoodItemAdded1 = Kanavali.updateFoodItem("panner","rajma chawal");

	Kanavali.getFoodItems();	
	Kanavali.deleteFoodItem("chiken tikka");	
	Kanavali.getFoodItems();	


}
}