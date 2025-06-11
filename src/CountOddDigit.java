import java.util.Scanner;

public class CountOddDigit {
    public static void main (String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        int OddCount=0;
        while(number!=0)
        {
            number=number/10;
            if(number%2!=0) OddCount++;
        }

        System.out.println("total odd number are : "+ OddCount);
    }
}
