class TeaShops {
	public static void main(String tea[]) {
		
		String teaShopName = "chaipoint";
		String teaShopAddress = "vidyaranapura";
		String teas[] = {"greentea" , "lemon tea" , "gingertea" , "elachitea"};
		int    teaPricing[] = {10, 12, 14, 20};
		String ownerName = "vivek";
		
		
		
		System.out.println("teaName is:" + teaShopName);
		System.out.println("teaAddress is:" + teaShopAddress);
		System.out.println("ownerName is:" + ownerName);

		System.out.println("no of tea items added is:"+ teas.length);
		System.out.println("teas is:");
		for(int index=0; index  < teas.length; index++)
		{
			System.out.println(teas[index] + "------->" + teaPricing[index]);
		}
		
		
		
		
	}
	
	
	
	
	
}