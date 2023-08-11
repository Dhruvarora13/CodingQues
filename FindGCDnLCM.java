import java.util.Scanner;

class FindGCDnLCM{

    //Write the code in java to display the GCD and LCM of two number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int n2 = sc.nextInt();
        int on1 = n1;
        int on2 = n2;
        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        int gcd = n2;
        int lcm = (on1 * on2) / gcd;

        System.out.println("The Gcd of "+on1+" and "+on2+" is :"+gcd);
        System.out.println("The Lcm of "+on1+" and "+on2+" is :"+lcm);
    }
}