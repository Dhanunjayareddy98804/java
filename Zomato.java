class Zomato{
public static double search(String foodItem){

if(foodItem == "Pizza"){
return 99.00;
}
if(foodItem == "Veg Roll"){
return 60.00;
}
if(foodItem == "Chiken Roll"){
return 65.00;
}
if(foodItem == "Shawarma"){
return 45.00;
}
if(foodItem == "Mango Juice"){
return 40.00;
}
if(foodItem == "Apple Juice"){
return 50.00;
}
if(foodItem == "Orange Juice"){
return 45.00;
}
if(foodItem == "Gobi Manchurian"){
return 100.00;
}
if(foodItem == "Sandwich"){
return 60.00;
}
if(foodItem == "veg Burger"){
return 70.00;
}
if(foodItem == "Chicken Burger"){
return 90.00;
}
if(foodItem == "noodles"){
return 60.00;
}
if(foodItem == "Egg Rice"){
return 50.00;
}
if(foodItem == "Fried Rice"){
return 50.00;
}
if(foodItem == "Chicken Fried Rice"){
return 50.00;
}
if(foodItem == "Pasta"){
return 70.00;
}
if(foodItem == "Egg Roll"){
return 60.00;
}
if(foodItem == "Panner Roll"){
return 99.00;
}
if(foodItem == "Kichidi"){
return 99.00;
}
if(foodItem == "Bisibelebath"){
return 60.00;
}
if(foodItem == "Chitrana"){
return 30.00;
}
if(foodItem == "Idli"){
return 20.00;
}
if(foodItem == "paddu"){
return 40.00;
}
if(foodItem == "Dosa"){
return 60.00;
}
if(foodItem == "Onion Dosa"){
return 70.00;
}
return 0.0;
}

public static double search(String foodItem,int quantity){
if(foodItem == "Pizza"){
return 99.00 * quantity;
}
if(foodItem == "Veg Roll"){
return 60.00 * quantity;
}
if(foodItem == "Chiken Roll"){
return 65.00 * quantity;
}
if(foodItem == "Shawarma"){
return 45.00 * quantity;
}
if(foodItem == "Mango Juice"){
return 40.00 * quantity;
}
if(foodItem == "Apple Juice"){
return 50.00 * quantity;
}
if(foodItem == "Orange Juice"){
return 45.00 * quantity;
}
if(foodItem == "Gobi Manchurian"){
return 100.00 * quantity;
}
if(foodItem == "Sandwich"){
return 60.00 * quantity;
}
if(foodItem == "veg Burger"){
return 70.00 * quantity;
}
if(foodItem == "Chicken Burger"){
return 90.00 * quantity;
}
if(foodItem == "noodles"){
return 60.00 * quantity;
}
if(foodItem == "Egg Rice"){
return 50.00 * quantity;
}
if(foodItem == "Fried Rice"){
return 50.00 * quantity;
}
if(foodItem == "Chicken Fried Rice"){
return 50.00 * quantity;
}
if(foodItem == "Pasta"){
return 70.00 * quantity;
}
if(foodItem == "Egg Roll"){
return 60.00 * quantity;
}
if(foodItem == "Panner Roll"){
return 99.00 * quantity;
}
if(foodItem == "Kichidi"){
return 99.00 * quantity;
}
if(foodItem == "Bisibelebath"){
return 60.00 * quantity;
}
if(foodItem == "Chitrana"){
return 30.00 * quantity;
}
if(foodItem == "Idli"){
return 20.00 * quantity;
}
if(foodItem == "paddu"){
return 40.00 * quantity;
}
if(foodItem == "Dosa"){
return 60.00 * quantity;
}
if(foodItem == "Onion Dosa"){
return 70.00 * quantity;
}
return 0.0;
}
}