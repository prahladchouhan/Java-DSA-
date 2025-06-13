// A perfect number is a positive integer that is equal to the sum of its proper 
// divisors, excluding the number itself.

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number !");
        int num = sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        if(num==sum) System.out.println("is Perfect number!");
        else System.out.println("is not Perfect number!");
    }
}
