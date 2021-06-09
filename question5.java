/**
 * @author T.A Theron - 20700601
 * @version 09-06-21 - 20 minutes
 */

// Took me longer than it should have...
public class question5 {

    public static int[] sorted = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 5, 5 };

    public static void main(String[] args) {
        int i = 0, j = 0, k = 0;
        while (i < sorted.length - 1) {
            // Change are made in-place, first k elements of `sorted` are the new array.
            sorted[k] = sorted[i];
            // k keeps track of how many unique elements there are.
            k++;
            while (sorted[j] == sorted[i] && j + 1 < sorted.length) {
                j++;
            }
            i = j;
        }
        System.out.println(k);
    }
}
