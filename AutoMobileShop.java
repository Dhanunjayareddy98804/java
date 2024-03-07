class AutoMobileShop {

    static String name = "arush";
    static String partItems[] = {null, null, null, null, null, null, null, null, null, null};
    static String ownername = "arun";
    static String address = "vidyaranapura";
    static String phoneNo = "9876543212";
    static int index;

    public static boolean addPartItems(String automobileShop) {
        System.out.println("inside addPartItems():");
        boolean isAdded = false;
        if (index < partItems.length) {
            partItems[index++] = automobileShop;
            isAdded = true;
            System.out.println("partItem added successfully..");

        } else {
            System.out.println("partItem array is full");
        }
        System.out.println("end of addPartItems():");
        return isAdded;
    }

    public static void getPartItem() {
        for (int index = 0; index < partItems.length; index++) {
            System.out.println(partItems[index]);
        }
    }
	public static boolean updatePartItems(String newPartItem,String oldPartItem){
		System.out.println("before updating Partitems:");
		boolean isUpdated = false;
		for(int index = 0; index < partItems.length;index++){
			if(partItems[index]== oldPartItem){
				partItems[index] = newPartItem;
				isUpdated = true;
			}
		}
		System.out.println("After updating PartItems:");
		return isUpdated;
	}
}
