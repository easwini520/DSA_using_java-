public class secmin {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3, 1}; // sample array

        if (arr == null || arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int v : arr) {
            if (v < min) {
                secondMin = min;
                min = v;
            } else if (v > min && v < secondMin) {
                secondMin = v;
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("No second minimum (all elements equal).");
        } else {
            System.out.println(secondMin);
        }
    }
}