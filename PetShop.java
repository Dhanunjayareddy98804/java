import java.util.Arrays;
class PetShop {

    static String name = "PetMart";
    static String accessories[] = {null, null, null, null, null, null, null, null, null, null};
    static String ownerName = "John Doe";
    static String address = "123 Main St";
    static String phoneNo = "9876543210";
    static int index;

    public static boolean addAccessories(String accessory) {
        System.out.println("inside addAccessories():");
        boolean isAdded = false;
        if (accessories != null) {
            accessories[index] = accessory;
			index++;
			isAdded = true;
            System.out.println("Accessory added successfully.");
        } else {
            System.out.println("Accessory cannot be added");
        }
        System.out.println("end of addAccessories():");
        return isAdded;
    }

    public static void getAccessories() {
        for (int index = 0; index < accessories.length; index++) {
            System.out.println(accessories[index]);
        }
    }
	public static boolean updateAcessories(String newAcessorie ,String oldAcessorie){
		System.out.println("before updating Accessorie:");
		boolean isUpdated = false;
		for(int index = 0; index < accessories.length;index++){
			if(accessories[index]== oldAcessorie){
				accessories[index] = newAcessorie;
				isUpdated = true;
			}
		}
		System.out.println("After updating Accessorie:");
		return isUpdated;
	}
	
	public static void deleteAccessories(String accessorie){
		System.out.println("Before deleting the Accessories"); 
		int newIndex, oldIndex;
		for(newIndex=0,oldIndex=0; oldIndex < accessories.length;oldIndex++){
			if(accessories[oldIndex] != accessorie){
				accessories[newIndex++] = accessories[oldIndex];
			}
		}
		System.out.println("After deleting the Accessories"); 
        accessories = Arrays.copyOf(accessories,newIndex);
		return;
	}
}
