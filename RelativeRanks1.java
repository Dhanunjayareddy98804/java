class RelativeRanks1 {
    public static void main(String[] args) {
        int[] score = {5, 4, 3, 2, 1};
        String[] result = findRelativeRanks(score);
        System.out.println(Arrays.toString(result));
    }

    public static String[] findRelativeRanks(int[] score) {
        String[] medals = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        String[] result = new String[score.length];
        
        // Create a copy of the scores array to preserve original order
        int[] sortedScore = Arrays.copyOf(score, score.length);
        Arrays.sort(sortedScore);
        int rank = 1;
        
        for (int i = score.length - 1; i >= 0; i--) {
            int index = indexOf(score, sortedScore[i]);
            if (rank <= 3) {
                result[index] = medals[rank - 1];
            } else {
                result[index] = String.valueOf(rank);
            }
            rank++;
        }
        
        return result;
    }
    
    // Helper method to find the index of an element in an array
    public static int indexOf(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
