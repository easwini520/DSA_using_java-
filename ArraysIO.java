import java.util.Scanner;

public class ArraysIO {
    public static void main(String[] args) {
        int maxSize = 5;
        System.out.println("Enter " + maxSize + " elements for first array:");
        int[] arr1 = input(maxSize);

        System.out.println("Enter " + maxSize + " elements for second array:");
        int[] arr2 = input(maxSize);

        int[] result = new int[maxSize];
        for (int i = 0; i < maxSize; i++) {
            result[i] = arr1[i] + arr2[i];
        }

        System.out.println("Sum of corresponding elements:");
        print(result);
    }

    // Method to input array elements
    public static int[] input(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    // Method to print array elements
    public static void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}