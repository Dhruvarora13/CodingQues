import java.util.Scanner;

class Inverse{

        // Write  code in java to print the Inverse of the number 
        //inputed by the user?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        int i=0;
        int op =1;
        while(ans != 0){
            int od =ans%10;
            int id = op;
            int ip = od;

            i = i + id*(int)Math.pow(10,ip-1);
            op++;
            ans =ans/10;
        }
        System.out.println(i);
    }
}