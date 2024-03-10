import java.util.Arrays;
class Decathlon {

    static String name = "Decathlon";
    static String products[] = {null, null, null, null, null, null, null, null, null, null};
    static String ownerName = "John Doe";
    static String address = "789 Pine St";
    static String phoneNo = "9876543210";
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
	
	public static void deleteProducts(String product){
		System.out.println("Before deleting the Products"); 
		int newIndex, oldIndex;
		for(newIndex=0,oldIndex=0; oldIndex < products.length;oldIndex++){
			if(products[oldIndex] != product){
				products[newIndex++] = products[oldIndex];
			}
		}
		System.out.println("After deleting the products"); 
        products = Arrays.copyOf(products,newIndex);
		return;
	}
}
