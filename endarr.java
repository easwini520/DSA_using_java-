import java.util.Arrays;

public class endarr {
    public static void moveZerosToEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int tmp = arr[j];
                arr[j++] = arr[i];
                arr[i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 5};
        System.out.println("Before: " + Arrays.toString(arr));
        moveZerosToEnd(arr);
        System.out.println("After:  " + Arrays.toString(arr));
    }
}