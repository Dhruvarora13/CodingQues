class TrapingRainWater {

    
    // Write a code in java to fing Total rain water Trapped?
    public static void main(String[] args) {


        int[] num = {4, 2, 6, 3, 2, 5};
        int n = num.length;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = num[0];
        right[n - 1] = num[n - 1];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(num[i], left[i - 1]);
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(num[i], right[i + 1]);
        }
        int trapwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(left[i], right[i]);
            trapwater += (waterlevel - num[i]);
        }
        System.out.println(trapwater);
    }
}