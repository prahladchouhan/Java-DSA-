import java.util.Scanner;
public class pattern01 {

    public static void main (String arg[])
    {
        Scanner Sc= new Scanner(System.in);

        System.out.println("enter the number of rows!");
        int rows=Sc.nextInt();
        // int rows=5;
        for(int i=0;i<=rows;i++)
        {
            for(int j=0;j<=rows;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
}