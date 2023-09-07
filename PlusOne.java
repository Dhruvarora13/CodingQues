public class PlusOne {
    public static void main(String[] args) {
        int [] digits = {1,2,3};
        digits = Plusone(digits);
        for (int i = 0; i <digits.length ; i++) {
            System.out.print(digits[i]);
        }

    }
    public static int[] Plusone(int [] digits){
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[n+1];
        digits[0]=1;
        return digits;
    }
}
