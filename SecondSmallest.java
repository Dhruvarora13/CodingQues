class SecondSmallest{
    public static void main(String[] args){
        int [] num ={5,4,1,9,8,3,2,4};
        int smallest = Integer.MAX_VALUE;
        int ssmallest = Integer.MAX_VALUE;
        for (int i = 0; i <num.length ; i++) {
            if(num[i]<smallest){
                ssmallest = smallest;
                smallest = num[i];
            } else if (num[i] >smallest && num[i] <ssmallest) {
                ssmallest = num[i];
            }
        }
        System.out.println("Second Smallest Element in an Given Array is : " + ssmallest);
    }
}