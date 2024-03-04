class Suppliments{

    static String name = "ram";
    static String items[] = {null, null, null, null, null, null, null, null, null, null};
    static String ownername = "raju";
    static String address = "bangalore";
    static String phoneNo = "9866743210";
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
            System.out.println("Item cannot be added");
        }
        System.out.println("end of addItems():");
        return isAdded;
    }

    public static void getItems() {
        for (int index = 0; index < items.length; index++) {
            System.out.println(items[index]);
        }
    }
}
