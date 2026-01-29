public class minmax {
    public static int[] findMinMax(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        int min = a[0], max = a[0];
        for (int i = 1; i < a.length; i++) {
            int v = a[i];
            if (v < min) min = v;
            else if (v > max) max = v;
        }
        return new int[] { min, max };
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 9, -2, 7 };
        int[] mm = findMinMax(arr);
        System.out.println("Min: " + mm[0] + ", Max: " + mm[1]);
    }
}