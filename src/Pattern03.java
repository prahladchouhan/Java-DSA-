import java.util.Scanner;
public class Pattern03 {
    
    public static void main (String arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter the rows size! ");
        int rows=sc.nextInt();

        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.err.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
