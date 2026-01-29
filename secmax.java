import java.util.TreeSet;

public class secmax {
    public static void main(String[] args)
     {
        int[] arr = {3, 5, 2, 5, 1}; 

        TreeSet<Integer> set = new TreeSet<>();
        for (int n : arr) set.add(n);

        if (set.size() < 2) {
            System.out.println("No second largest (need at least two distinct values)");
        } else {
            set.pollLast(); 
            System.out.println(set.last()); 
        }
    }
}