class Restaurant {
 public static void main(String raju[]){
	String restaurantName = "rajaram";
	String location = "bellary";
	String ownerName = "raja";
	String vegSoups[] = {"vegetable soup" , "mix vegetable soup" , "hot soup" , "tomato soup" , "corn soup" , "rasam soup" , "sambar soup"};
	int    vegSoupsPricing[] = {395 , 395 , 395 , 395 , 395 , 395 ,395};
	String southIndianSpecial[] =	{"idli" , "dosa" , "vada" , "masala dosa" , "onion dosa" , "utapam" , "set dosa" , "poori"};
	int    southIndianSpecialPricing[] = {60, 60, 60, 60, 60, 60, 60, 60};
	String nonVegeterian[] = {"kabab" , "chickenbiriyani" , "hyderbadbiriyani" , "chilli chicken" , "kadai chicken" , "butter chicken" , "chicken masala"};
	int    nonVegeterianPricing[] = {200, 200, 200, 200, 200, 200, 200};

    System.out.println("restaurantName is :" + restaurantName);
	System.out.println("location is :" + location);
	System.out.println("ownerName is :" + ownerName);
	
	System.out.println("no of values added in vegSoups is:"+ vegSoups.length);
	System.out.println("1.VEGSOUPS are:");
	for(int index = vegSoups.length-1; index >= 0; index--){
	System.out.println(vegSoups[index]   + "-------->" + vegSoupsPricing[index]);	
	}
	
	System.out.println("no of values added in southIndianSpecial is:"+ southIndianSpecial.length);
	System.out.println("2.SOUTHINDIANSPECIAL are:");
	for(int index = southIndianSpecial.length-1;index >= 0; index--){
	System.out.println(southIndianSpecial[index] + "-------->" + southIndianSpecialPricing[index]);	
	}
 
    System.out.println("no of values added in nonVegeterian is:"+ nonVegeterian.length);
	System.out.println("3.NONVEGETERIAN are:");
	for(int index = nonVegeterian.length-1; index>=0; index--){
	System.out.println(nonVegeterian[index] + "-------->" + nonVegeterianPricing[index]);	
	}
 }
 
 }