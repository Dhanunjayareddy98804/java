class Behrouz{
public static double search(String foodItem){

if(foodItem == "gosht haleem"){
return 99.00;
}
if(foodItem == "murgh haleem"){
return 60.00;
}
if(foodItem == "royal baklava"){
return 65.00;
}
if(foodItem == "royal dates"){
return 45.00;
}
if(foodItem == "murgh biriyani"){
return 40.00;
}
if(foodItem == "khumb biriyani"){
return 50.00;
}
if(foodItem == "paneer biriyani"){
return 45.00;
}
if(foodItem == "veg dum biriyani"){
return 100.00;
}
if(foodItem == "egg biriyani"){
return 60.00;
}
if(foodItem == "tikka biryani"){
return 70.00;
}
if(foodItem == "peanut kabab"){
return 90.00;
}
if(foodItem == "flafel"){
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
if(foodItem == "dahi kabab"){
return 70.00;
}
if(foodItem == "Egg Roll"){
return 60.00;
}
if(foodItem == "Panner Roll"){
return 99.00;
}
if(foodItem == "meatball"){
return 99.00;
}
if(foodItem == "murgh haleem kabab"){
return 60.00;
}
if(foodItem == "hara bhara kabab"){
return 30.00;
}
if(foodItem == "malai kabab"){
return 20.00;
}
if(foodItem == "seekh kabab"){
return 40.00;
}
if(foodItem == "chaap tikki"){
return 60.00;
}
if(foodItem == "veg kabab"){
return 70.00;
}
return 0.0;
}

public static double search(String foodItem,int quantity){
if(foodItem == "gosht haleem"){
return 99.00 * quantity;
}
if(foodItem == "murgh haleem"){
return 60.00 * quantity;
}
if(foodItem == "royal baklava"){
return 65.00 * quantity;
}
if(foodItem == "royal dates"){
return 45.00 * quantity;
}
if(foodItem == "murgh biriyani"){
return 40.00 * quantity;
}
if(foodItem == "khumb biriyani"){
return 50.00 * quantity;
}
if(foodItem == "paneer biriyani"){
return 45.00 * quantity;
}
if(foodItem == "veg dum biriyani"){
return 100.00 * quantity;
}
if(foodItem == "egg biriyani"){
return 60.00 * quantity;
}
if(foodItem == "tikka biryani"){
return 70.00 * quantity;
}
if(foodItem == "peanut kabab"){
return 90.00 * quantity;
}
if(foodItem == "flafel"){
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
if(foodItem == "dahi kabab"){
return 70.00 * quantity;
}
if(foodItem == "Egg Roll"){
return 60.00 * quantity;
}
if(foodItem == "Panner Roll"){
return 99.00 * quantity;
}
if(foodItem == "meatball"){
return 99.00 * quantity;
}
if(foodItem == "murgh haleem kabab"){
return 60.00 * quantity;
}
if(foodItem == "hara bhara kabab"){
return 30.00 * quantity;
}
if(foodItem == "malai kabab"){
return 20.00 * quantity;
}
if(foodItem == "seekh kabab"){
return 40.00 * quantity;
}
if(foodItem == "chaap tikki"){
return 60.00 * quantity;
}
if(foodItem == "veg kabab"){
return 70.00 * quantity;
}
return 0.0;
}
}