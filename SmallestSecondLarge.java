class SmallestSecondLarge{
    public static void main(String[] args) {
        int [] num = {5,2,4,9,8,3,4,1,8,15,8};

        int largest = Integer.MIN_VALUE;
        int Secondlarge = Integer.MIN_VALUE;

        int Smallest = Integer.MAX_VALUE;


        int n = num.length;

        for (int i = 0; i < n  ; i++) {
            if(num[i]>largest){
                Secondlarge = largest;

                largest = num[i];
            }
            if(num[i]<Smallest){
                Smallest=num[i];

            }
            if(num[i] <largest && num[i]> Secondlarge){
                Secondlarge=num[i];
            }

        }
        System.out.println("Smallest element in an array is :" + Smallest);
        System.out.println("Second Largest element in an array is :" + Secondlarge);
    }
}