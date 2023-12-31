public class FirstOccurance {
    // Write a code in java to print the index of the occured string?
    public static void main(String[] args) {
        String haystack = "sadstay";
        String needle = "sad";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if(n < m) {
            return -1;
        }
        for(int i = 0; i <= n-m; i++) {
            int j;
            for( j = 0; j < m; j++) {
                if(haystack.charAt(i+j) != needle.charAt(j)) {
                    break;
                }
            }
            if(j == m) {
                return i;
            }
        }
        return -1;
    }
}
