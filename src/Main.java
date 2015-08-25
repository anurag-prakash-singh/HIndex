import java.util.Arrays;

/**
 * Created by anurags on 8/24/15.
 */
public class Main {

    private static int hIndex(Integer[] arr) {
        int len = arr.length;
        int[] counts = new int[len + 1];
        int countsSoFar = 0;

        for (int i = 0; i < len; i++) {
            counts[Math.min(arr[i], len)]++;
        }

        for (int i = counts.length - 1; i >= 0; i--) {
            countsSoFar += counts[i];

            if (countsSoFar >= i) {
                return i;
            }
        }

        return 0;
    }

    private static void test1() {
        Integer[][] inputs = new Integer[][] {
                new Integer[] {2, 1, 3, 5},
                new Integer[] {0},
                new Integer[] {5, 3, 2, 1, 7, 8}
        };

        for (Integer[] input : inputs) {
            System.out.println(Arrays.toString(input) + "; hIndex = " + hIndex(input));
        }
    }

    public static void main(String[] args) {
        test1();
    }
}
