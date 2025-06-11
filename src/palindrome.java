import java.util.Scanner;

public class palindrome {
    public static void main (String arg[]){

        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number to check!");
        int num=Sc.nextInt();
        int copynum=num;
        int rev=0;
        while (num!=0) {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
            
        }
        if(copynum==rev) System.out.println("palindrome!");
        else System.out.println("Not Palindrome!");
    }
}
