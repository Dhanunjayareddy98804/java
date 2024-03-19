import java.util.Arrays;
class MedicalShop{

    static String name = "rajaram";
    static String items[] = {null, null, null, null, null, null, null, null, null, null};
    static String ownername = "ram";
    static String address = "sirguppa";
    static String phoneNo = "9812743210";
    static int index;

    public static boolean addItems(String item) {
        System.out.println("inside addItems():");
        boolean isAdded = false;
        if (items != null) {
            items[index] = item;
			index++;
            isAdded = true;
            System.out.println("Item added successfully.");
        } else {
            System.out.println("Item cannot be added.");
        }
        System.out.println("end of addItems():");
        return isAdded;
    }

    public static void getItems() {
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
	
	public static void deleteItems(String item){
		System.out.println("Before deleting the Items"); 
		int newIndex, oldIndex;
		for(newIndex=0,oldIndex=0; oldIndex < items.length;oldIndex++){
			if(items[oldIndex] != item){
				items[newIndex++] = items[oldIndex];
			}
		}
		System.out.println("After deleting the Items"); 
        items = Arrays.copyOf(items,newIndex);
		return;
	}
	
}
