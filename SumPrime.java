class SumPrime{
    public static void main(String [] args){
        int num =5387;
        int m=num,sum =0,r;
        while(num>0){
            r=num%10;
            int d =2,count=0;
            while(d<r/2){
                if(r%d ==0){
                    count++;

                }
                d++;
            }
            if(count==0){
                sum = sum +r;
            }
            num=num/10;
        }
        System.out.println("The sum of the Prime Digit in Number :"+m+" is :" +sum);
    }
}