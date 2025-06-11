import java.util.Scanner;;
public class TrianglePattern {
    
    public static void main (String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows! ");
        int rows= sc.nextInt();
        for(int i=1;i<=rows;i++)
        {
            for(int j=i;j<=rows;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            for(int j=i;j<=rows;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
