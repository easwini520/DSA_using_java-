import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array must contain at least one element.");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int max = arr[0];
        for (int i = 1; i < n; i++) if (arr[i] > max) max = arr[i];

        System.out.println("Maximum element: " + max);
    }
}