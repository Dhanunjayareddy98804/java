class Ecommerce{

    static String name = "flipkart";
    static String items[] = {null, null, null, null, null, null, null, null, null, null};
    static String ownername = "sachin bansal";
    static String address = "chandigarh";
    static String phoneNo = "9812743210";
    static int index;

    public static boolean addProducts(String products) {
        System.out.println("inside addProducts():");
        boolean isAdded = false;
        if (products != null && index < products.length) {
            products[index++] = product;
            isAdded = true;
            System.out.println("product added successfully.");
        } else {
            System.out.println("product cannot be added");
        }
        System.out.println("end of addProducts():");
        return isAdded;
    }

    public static void getProduct() {
        for (int index = 0; index < products.length; index++) {
            System.out.println(products[index]);
        }
    }
}
