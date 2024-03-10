import java.util.Arrays;
class Kanavali{

static String name = "7 seasons";
static String foodItems[] = {null,null,null,null,null,null,null};
static String ownername = "govinda govinda";
static String address = "rajajinagar";
static int index;

public static boolean addFoodItems(String foodItem){
System.out.println("inside addFoodItems():");
boolean isAdded = false;
if(foodItem != null){
	foodItems[index++] = foodItem;
	isAdded = true;
	System.out.println("food item added successfully..");
	
}else{
	System.out.println("food Item cant be null");
}
System.out.println("end of addFoodItems():");
return isAdded;
}


public static void getFoodItems(){
	for(int index = 0; index < foodItems.length; index++){
		System.out.println(foodItems[index]);
	}
}
	public static boolean updateFoodItem(String newFoodItem ,String oldFoodItem){
		System.out.println("before updating foodItem:");
		boolean isUpdated = false;
		for(int index = 0; index < foodItems.length;index++){
			if(foodItems[index]== oldFoodItem){
				foodItems[index] = newFoodItem;
				isUpdated = true;
			}
		}
		System.out.println("After updating foodItem:");
		return isUpdated;
	}
	
	public static void deleteFoodItem(String foodItem){
		System.out.println("before deleting foodItem:");
		int newIndex, oldIndex;
		for(newIndex=0,oldIndex=0; oldIndex<foodItems.length;oldIndex++){
			if(foodItems[oldIndex] != foodItem){
				foodItems[newIndex++] = foodItems[oldIndex];
			}
		}
		System.out.println("After deleting foodItem:");
		foodItems = Arrays.copyOf(foodItems,newIndex);
		return;
	}

}