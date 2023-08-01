class PrintSubarray{

//Write a code in java to print the Subarray of the given Array and Also print the total no. of subarray Formed?

    public static void main(String []args){
        int []arr = {2,4,6,8,10};
        subarray(arr);
    }
    static void subarray(int []arr){
        int cs =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k =i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
                cs++;
            }
            System.out.println();
        }
        System.out.println("Total Subarrays:"+cs);
    }
}