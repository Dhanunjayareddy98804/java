class Permutation {
    public static void main(String[] args) {
        int nPr = permutation(3, 5);
        System.out.println("Permutation of 3 items taken 5 at a time: " + nPr);
    }

    // Method to calculate permutation
    public static int permutation(int n, int r) {
        return fact(n) / fact(n - r);
    }

    // Method to calculate factorial
    public static int fact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
