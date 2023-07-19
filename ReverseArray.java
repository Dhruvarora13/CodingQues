class ReverseArray{
    public static int[] Reverse(int [] num){
        int temp;
        int n =num.length;
        for(int i =0;i<n/2;i++){
            temp = num[i];
            num[i] = num[n-i-1];
            num[n-i-1] = temp;

        }
        return num;

    }
    public static void main(String [] args){
        int [] arr = {2,4,6,8,9,10};
        Reverse(arr);
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }

    }
}