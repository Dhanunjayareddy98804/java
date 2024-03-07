class Ecommerce {

    static String name = "flipkart";
    static String items[] = {null, null, null, null, null, null, null, null, null, null};
    static String ownername = "sachin bansal";
    static String address = "chandigarh";
    static String phoneNo = "9812743210";
    static int index;

    public static boolean addProducts(String product) {
        System.out.println("inside addProducts():");
        boolean isAdded = false;
        if (items != null) {
            items[index] = product;
			index++;
            isAdded = true;
            System.out.println("product added successfully.");
        } else {
            System.out.println("product cannot be added");
        }
        System.out.println("end of addProducts():");
        return isAdded;
    }

    public static void getProducts() {
        for (int index = 0; index < items.length; index++) {
            System.out.println(items[index]);
        }
    }
	public static boolean updateItems(String newItem,String oldItem){
		System.out.println("before updating items:");
		boolean isUpdated = false;
		for(int index = 0; index < items.length;index++){
			if(items[index]== oldItem){
				items[index] = newItem;
				isUpdated = true;
			}
		}
		System.out.println("After updating Items:");
		return isUpdated;
	}
}
