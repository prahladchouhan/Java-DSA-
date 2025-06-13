import java.util.Scanner;

public class ArmstrongNo {
    
    public static void main (String arg[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number!");
        int num=sc.nextInt();
        int copy=num;
        int n=String.valueOf(num).length();
        int sum=0;
        while(num>0)
        {
            int digit=num%10;
             sum+=Math.pow(digit,n);
             num/=10;

        }
        if(copy==sum) System.out.println(":ArmStrong Number!");
        else System.out.println(":Not a ArmStrong Number!");
    }

}
