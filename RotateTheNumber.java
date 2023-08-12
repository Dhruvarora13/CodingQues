import java.util.Scanner;

class RotateTheNumber{

    //Write the code in Java Rotate the Number By K rotation
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        System.out.print("Enter no. of rotation : ");
        int k = sc.nextInt();

        int temp = num;
        int nod =0;
        while(temp>0){
            temp = temp/10;
            nod++;
        }
        if(k<0){
            k=k+nod;
        }
        k=k%nod;
        int div = 1;
        int mul =1;
        for(int i=1;i<=nod;i++){
            if(i<=k){
                div = div*10;
            }
            else{
                mul=mul*10;
            }
        }
        int q = num/div;
        int r = num%div;
        int rot = r*mul + q;
        System.out.println(rot);
    }
}