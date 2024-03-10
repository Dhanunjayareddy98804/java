class Dominos{
public static double search(String foodItem){

if(foodItem == "marghrita pizza"){
return 99.00;
}
if(foodItem == "farmhouse pizza"){
return 60.00;
}
if(foodItem == "corn chesse pizza"){
return 65.00;
}
if(foodItem == "peppy paneer pizza"){
return 45.00;
}
if(foodItem == "chesse n corn pizza"){
return 40.00;
}
if(foodItem == "double chesse marghrita pizza"){
return 50.00;
}
if(foodItem == "tandoori paneer pizza"){
return 45.00;
}
if(foodItem == "paprika pizza"){
return 100.00;
}
if(foodItem == "veggie paradise pizza"){
return 60.00;
}
if(foodItem == "onion pizza"){
return 70.00;
}
if(foodItem == "achari do pyaza pizza"){
return 90.00;
}
if(foodItem == "extravagnza pizza"){
return 60.00;
}
if(foodItem == "green wave pizza"){
return 50.00;
}
if(foodItem == "gourmet pizza"){
return 50.00;
}
if(foodItem == "chicken sausage pizza"){
return 50.00;
}
if(foodItem == "barbecue pizza"){
return 70.00;
}
if(foodItem == "keema paratha pizza"){
return 60.00;
}
if(foodItem == "chicken dominator"){
return 99.00;
}
if(foodItem == "chicken tikka"){
return 99.00;
}
if(foodItem == "veg supreme"){
return 60.00;
}
if(foodItem == "feast pizza"){
return 30.00;
}
if(foodItem == "pepperoni"){
return 20.00;
}
if(foodItem == "breadsticks"){
return 40.00;
}
if(foodItem == "veg parcel"){
return 60.00;
}
if(foodItem == "chicken parcel"){
return 70.00;
}
return 0.0;
}

public static double search(String foodItem,int quantity){
if(foodItem == "marghrita pizza"){
return 99.00 * quantity;
}
if(foodItem == "farmhouse pizza"){
return 60.00 * quantity;
}
if(foodItem == "corn chesse pizza"){
return 65.00 * quantity;
}
if(foodItem == "peppy paneer pizza"){
return 45.00 * quantity;
}
if(foodItem == "chesse n corn pizza"){
return 40.00 * quantity;
}
if(foodItem == "double chesse marghrita pizza"){
return 50.00 * quantity;
}
if(foodItem == "tandoori paneer pizza"){
return 45.00 * quantity;
}
if(foodItem == "paprika pizza"){
return 100.00 * quantity;
}
if(foodItem == "veggie paradise pizza"){
return 60.00 * quantity;
}
if(foodItem == "onion pizza"){
return 70.00 * quantity;
}
if(foodItem == "achari do pyaza pizza"){
return 90.00 * quantity;
}
if(foodItem == "extravagnza pizza"){
return 60.00 * quantity;
}
if(foodItem == "green wave pizza"){
return 50.00 * quantity;
}
if(foodItem == "gourmet pizza"){
return 50.00 * quantity;
}
if(foodItem == "chicken sausage pizza"){
return 50.00 * quantity;
}
if(foodItem == "barbecue pizza"){
return 70.00 * quantity;
}
if(foodItem == "keema paratha pizza"){
return 60.00 * quantity;
}
if(foodItem == "chicken dominator"){
return 99.00 * quantity;
}
if(foodItem == "chicken tikka"){
return 99.00 * quantity;
}
if(foodItem == "veg supreme"){
return 60.00 * quantity;
}
if(foodItem == "feast pizza"){
return 30.00 * quantity;
}
if(foodItem == "pepperoni"){
return 20.00 * quantity;
}
if(foodItem == "breadsticks"){
return 40.00 * quantity;
}
if(foodItem == "veg parcel"){
return 60.00* quantity;
}
if(foodItem == "chicken parcel"){
return 70.00 * quantity;
}
return 0.0;
}
}