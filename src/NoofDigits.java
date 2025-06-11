import java.util.Scanner;

public class NoofDigits {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number!");
        int num = sc.nextInt();
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }

        // Second way!!
    //    int count=(int)(Math.log10(num)+1);
        System.out.println("Number of digits are : " + count);
    }
}
