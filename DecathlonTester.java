class DecathlonTester {

    public static void main(String[] dec) {
		System.out.println("shop address is:" + Decathlon.address);
        Decathlon.addProducts("Football");
        Decathlon.addProducts("Basketball");
        Decathlon.addProducts("Running Shoes");
        Decathlon.addProducts("Tennis Racket");
        Decathlon.addProducts("Swimming Goggles");
        Decathlon.addProducts("Yoga Mat");
        Decathlon.addProducts("Cycling Helmet");
        Decathlon.addProducts("Gym Gloves");
        Decathlon.addProducts("Hiking Boots");
        Decathlon.addProducts("Ski Jacket");

        Decathlon.getProducts();
    }
}
