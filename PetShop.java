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
}
