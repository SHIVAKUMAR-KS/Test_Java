package PS_Sprint_1;

import java.util.Scanner;

public class Digit_Sum {
    public static int helper(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n Value:");
        int n= sc.nextInt();

        int res=helper(n);
        System.out.println(res);

    }
}
