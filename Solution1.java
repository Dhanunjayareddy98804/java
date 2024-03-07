class Solution1 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // If we're here, it means all digits were 9, so we need to add an extra digit.
        int[] digits2 = new int[digits.length + 1];
        digits2[0] = 1; // Set the most significant digit to 1.
        return digits2;
    }
}
