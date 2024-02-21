class JuiceAngadi {
	public static void main(String juice[]) {
		
		String juiceShopName = "pavanjuice";
		String juiceShopAddress = "ms palya";
		int noOfworkers = 6;
		String ownerName = "pavan";
		int    rent = 6000;
		String typeOfJuices[] =  {"apple juice" , "mango juice" , "orange juice" , "papaya juice" , "watermelon juice"}; 
		int    typeOfJuicesPricing[] = {30 ,  40 , 50 , 50 , 30};
		
		System.out.println("juiceShopName is:" + juiceShopName);
		System.out.println("juiceShopAddress is:" + juiceShopAddress);
		System.out.println("noOfworkers is:" + noOfworkers);
		System.out.println("ownerName is:" + ownerName);
		System.out.println("rent is:"  + rent);		
		
		System.out.println("no of juice items added is:" + typeOfJuices.length);
		System.out.println("typeOfJuices is:");
		for(int index = typeOfJuices.length-1; index>=0; index--){
			System.out.println(typeOfJuices[index] + "-------->" + typeOfJuicesPricing[index]);
		}
	}	
}