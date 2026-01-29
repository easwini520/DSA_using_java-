import java.util.Arrays;
import java.util.Scanner;

public class twoarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] sum = new int[n];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();

        for (int i = 0; i < n; i++) sum[i] = a[i] + b[i];

        System.out.println("First array:  " + Arrays.toString(a));
        System.out.println("Second array: " + Arrays.toString(b));
        System.out.println("Sum array:    " + Arrays.toString(sum));
        sc.close();
    }
}