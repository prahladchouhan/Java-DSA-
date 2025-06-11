import java.util.Scanner;

public class ReverseNum {
    public static void main (String arg[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number!");
        int num=Sc.nextInt();
        int rev=0;
        while(num!=0)
        {
            int rem=num%10;
             rev=rev*10+rem;
             num=num/10;
        }
        System.out.println("Reverse : "+rev);
    }
}
