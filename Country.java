class Country {
public static void main(String country[]){

     
	  String indiaStates[] = {"Uttar Pradesh", "Maharashtra", "Bihar", "West Bengal", "Madhya Pradesh", "Tamil Nadu", "Rajasthan", "Karnataka", "Gujarat", "Andhra Pradesh", "Odisha", "Telangana", "Kerala", "Jharkhand", "Assam"};
	  String indiaCities[] = {"Mumbai", "Delhi", "Bangalore", "Hyderabad", "Ahmedabad", "Chennai", "Kolkata", "Surat", "Pune", "Jaipur", "Lucknow", "Kanpur", "Nagpur", "Visakhapatnam", "Indore", "Thane", "Bhopal", "Patna", "Vadodara","Ghaziabad"};
     
	  System.out.println("no of values added in country is:" );
	  System.out.println("1.indiaStates are:");
	  for(int index = indiaStates.length-1; index>=0; index--){
		  System.out.println(indiaStates[index] + "-------->" + indiaStates.length);
	  }
 
	  System.out.println("no of values added in cities is:");
	  System.out.println("2.indiaCities are:");
	  for(int index = indiaCities.length-1; index>=0; index--){
		  System.out.println(indiaCities[index] + "-------->" + indiaCities.length);
	  }


	  }

}