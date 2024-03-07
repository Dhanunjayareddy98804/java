class Three {
    public static void main(String read[]) {
        threee();
    }

    public static void threee() {
        int num1[] = {97, 13, 86, 24, 33, 52, 28, 52, 4, 29, 13, 26};
        int target = 30;
        for (int i=0; i < num1.length; i++) {
            for (int j = i + 1; j < num1.length; j++) {
                for (int k = j + 1; k < num1.length; k++) {
                    if (num1[i] + num1[j] + num1[k] == target) {
                        System.out.println("["+ i + " , " + j + " , " + k + "]");
                    }
                }
            }
        }
    }
}
