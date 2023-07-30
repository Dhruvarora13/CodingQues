class ArraySortedOrNot{
    public static void main(String[] args) {
        int [] num = {1,3,4,6,5,8,9,10};
        int count=0;
        for (int i = 0; i < num.length-1; i++) {
            if(num[i]>num[i+1]){
                count++;
                System.out.println("Given array is not a Sorted Array ");
                break;
            }
        }
        if(count == 0){
            System.out.println("Given array is a Sorted Array ");
        }
    }
}