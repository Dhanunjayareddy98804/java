class PetShopTester {

    public static void main(String[] pet) {
		System.out.println("shop address is:" + PetShop.address);
        PetShop.addAccessories("Dog Collar");
        PetShop.addAccessories("Cat Litter Box");
        PetShop.addAccessories("Fish Tank");
        PetShop.addAccessories("Bird Cage");
        PetShop.addAccessories("Hamster Wheel");
        PetShop.addAccessories("Reptile Heat Lamp");
        PetShop.addAccessories("Rabbit Hutch");
        PetShop.addAccessories("Pet Brush");
        PetShop.addAccessories("Pet Carrier");
        PetShop.addAccessories("Scratching Post");

        PetShop.getAccessories();
    }
}
