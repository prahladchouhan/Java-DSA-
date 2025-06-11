import java.util.Scanner;
public class Pattern02 {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter th eno. of rows!");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
