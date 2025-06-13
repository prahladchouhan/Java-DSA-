import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter array element! ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int largest=arr.length-1;
        for(int i=arr.length-1;i>0;i--)
        {
         if(arr[largest]>arr[i]){
            System.out.println("Second largest! "+arr[i]);
            // return;
            break;
         }   
        }
    }
}
