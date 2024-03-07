class HotComs {

    static String name = "HotComs";
    static String products[] = {null, null, null, null, null, null, null, null, null, null};
    static String ownerName = "Jane Smith";
    static String address = "456 Oak St";
    static String phoneNo = "1234567890";
    static int index;

    public static boolean addProducts(String product) {
        System.out.println("inside addProducts():");
        boolean isAdded = false;
        if (products != null) {
            products[index] = product;
			index++;
            isAdded = true;
            System.out.println("Product added successfully.");
        } else {
            System.out.println("Product cannot be added.");
        }
        System.out.println("end of addProducts():");
        return isAdded;
    }

    public static void getProducts() {
        for (int index = 0; index < products.length; index++) {
            System.out.println(products[index]);
        }
    }
	public static boolean updateProducts(String newProduct ,String oldProduct){
		System.out.println("before updating products:");
		boolean isUpdated = false;
		for(int index = 0; index < products.length;index++){
			if(products[index]== oldProduct){
				products[index] = newProduct;
				isUpdated = true;
			}
		}
		System.out.println("After updating products:");
		return isUpdated;
	}
}
