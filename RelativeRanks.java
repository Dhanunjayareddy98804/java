class RelativeRanks {
    public static void main(String[] args) {
        int[] scores = {5, 8, 3, 2, 9};
        String[] ranks = findRelativeRanks(scores);
        System.out.println(Arrays.toString(ranks));
    }

    public static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] sortedScore = score.clone();
        Arrays.sort(sortedScore);
        
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                map.put(sortedScore[i], "Gold Medal");
            } else if (i == n - 2) {
                map.put(sortedScore[i], "Silver Medal");
            } else if (i == n - 3) {
                map.put(sortedScore[i], "Bronze Medal");
            } else {
                map.put(sortedScore[i], String.valueOf(n - i));
            }
        }

        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = map.get(score[i]);
        }

        return result;
    }
}
