public static void main(String[] args) {
        WirelessEarphones earphones = new WirelessEarphones(
                "7.3 x 3.7 x 2.9 cm; 4 Grams",
                "E504A",
                "Bluetooth",
                "Wireless",
                "11Mm Bass-Tuned Dynamic Drivers, 38 Hours Of Battery, Flash Charge For 10 Minutes, Listen For 5 Hours, Active Noise Cancellation With Transparency Mode, Water Resistant, Up to 38 Hrs of Playtime, Bluetooth True Wireless Connectivity, Call Control, Touch Control",
                "Wireless",
                "usb",
                "True Wireless",
                "Matte Black",
                "User Manual, 1 x Warranty & Safety Card, Type-C Charging Cable, Wireless Charging Case, Eartip",
                "OnePlus",
                "China",
                4);

        System.out.println("Product Dimensions: " + earphones.productDimensions);
        System.out.println("Item Model Number: " + earphones.itemModelNumber);
        System.out.println("Wireless Communication Technologies: " + earphones.wirelessCommunicationTechnologies);
        System.out.println("Connectivity Technologies: " + earphones.connectivityTechnologies);
        System.out.println("Special Features: " + earphones.specialFeatures);
        System.out.println("Other Display Features: " + earphones.otherDisplayFeatures);
        System.out.println("Audio Jack: " + earphones.audioJack);
        System.out.println("Form Factor: " + earphones.formFactor);
        System.out.println("Color: " + earphones.color);
        System.out.println("What's in the Box: " + earphones.whatsInTheBox);
        System.out.println("Manufacturer: " + earphones.manufacturer);
        System.out.println("Country of Origin: " + earphones.countryOfOrigin);
        System.out.println("Item Weight: " + earphones.itemWeight + " g");
    }
}
