class HotComsTester {

    public static void main(String[] hot) {
		System.out.println("shop address is:" + HotComs.address);
        HotComs.addProducts("apple");
        HotComs.addProducts("brinjal");
        HotComs.addProducts("tomato");
        HotComs.addProducts("pumpkin");
        HotComs.addProducts("watermelon");
        HotComs.addProducts("dragon fruit");
        HotComs.addProducts("papaya");
        HotComs.addProducts("banana");
        HotComs.addProducts("grapes");
        HotComs.addProducts("orange");

        HotComs.getProducts();
		boolean isProductsAdded = HotComs.updateProducts("strawberry","apple");
		HotComs.getProducts();
		HotComs.deleteProducts("orange");
		HotComs.getProducts();

    }
}
