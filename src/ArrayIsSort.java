import java.util.Scanner;

public class ArrayIsSort {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter array element! ");
            arr[i] = sc.nextInt();
        }
        boolean check = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                check = false;
            }
        }
        if (check)
            System.out.println("sorted!");
        else
            System.out.println("Not Sorted!");
    }

}
