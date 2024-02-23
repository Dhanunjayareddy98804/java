class PowerDelivery {
    public static void main(String args[]) {
        String brand = "Dell";
        String manufacturer = "Dell Technologies"; // Changed variable name to avoid duplication
        String series = "WD19TBS Docking Station";
        String colour = "Black";
        int itemHeight = 12; // Assuming the unit is in inches
        int itemWidth = 11; // Assuming the unit is in inches
        String productDimensions = "6.35 x 28.96 x 30.48 cm"; // Changed type to String to represent dimensions
        String itemmodelNumber = "WD19TBS";
        String connectivityType = "Wi-Fi"; // Corrected connectivity type
        int wattage = 130;
        boolean areBatteriesIncluded = false; // Corrected variable name to adhere to Java naming convention
        String includedComponents = "Docking Station";
        String countryofOrigin = "India"; // Removed extra characters
        int itemWeight = 1570; // Corrected value to represent grams

        System.out.println("brand is " + brand);
        System.out.println("manufacturer is " + manufacturer);
        System.out.println("series is " + series);
        System.out.println("colour is " + colour);
        System.out.println("itemHeight is " + itemHeight + " Inches");
        System.out.println("itemWidth is " + itemWidth + " Inches");
        System.out.println("productDimensions is " + productDimensions);
        System.out.println("itemmodelNumber is " + itemmodelNumber);
        System.out.println("connectivityType is " + connectivityType);
        System.out.println("wattage is " + wattage + " Watts");
        System.out.println("areBatteriesIncluded is " + areBatteriesIncluded);
        System.out.println("includedComponents is " + includedComponents);
        System.out.println("countryofOrigin is " + countryofOrigin);
        System.out.println("itemWeight is " + itemWeight + " g");
    }
}
