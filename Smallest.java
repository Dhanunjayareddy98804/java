class Smallest {
    public static void main(String small[]) {
        sqr();
        evenOddNumber();
        System.out.println("sorted array");
        sort();
        secondSmallest();
    }

    public static void sqr() {
        int number[] = {3, 4, 5, 6, 7, 8, 9};
        for (int index = 0; index < number.length; index++) {
            System.out.println("element: " + number[index]);
            System.out.println("result: " + number[index] * number[index]);
        }
    }

    public static void evenOddNumber() {
        int number[] = {4, 5, 6, 7, 8, 9, 10};
        for (int index = 0; index < number.length; index++) {
            if (number[index] % 2 == 0) {
                System.out.println("Even number: " + number[index]);
            } else {
                System.out.println("Odd number: " + number[index]);
            }
        }
    }

    public static void sort() {
        int number[] = {5, 9, 3, 4, 1};
        for (int index = 0; index < number.length; index++) {
            for (int ref = 0; ref < number.length; ref++) {
                if (number[index] < number[ref]) {
                    int temp = number[ref];
                    number[ref] = number[index];
                    number[index] = temp;
                }
            }
        }

        for (int index = 0; index < number.length; index++) {
            System.out.println("sort result: " + number[index]);
        }
    }

    public static void secondSmallest() {
        int number[] = {5, 9, 3, 4, 1};
        for (int index = 0; index < number.length; index++) {
            for (int ind = 0; ind < number.length; ind++) {
                if (number[index] < number[ind]) {
                    int temp = number[ind];
                    number[ind] = number[index];
                    number[index] = temp;
                }
            }
        }

        for (int index = 0; index < number.length; index++) {
            System.out.println("Sorted number in the array: " + number[index]);
        }
        System.out.println("Second smallest number in the array: " + number[1]);
    }
}
