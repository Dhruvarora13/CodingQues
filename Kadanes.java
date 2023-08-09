class Kadanes{

    //KADANES ALGORITHM  TO find max sum of subarray?    --Kadanes.java
    public static void main(String[] args) {
        int [] arr ={-1,3,-2,5,-2,6};
        System.out.println(kadanes(arr));
    }
    public static int kadanes(int [] arr){
        int cs =0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            cs += arr[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs,ms);
        }
        return ms;
    }

}