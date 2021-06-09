/**
 * @author T.A. Theron - 20700601
 * @version 08-06-2021 - 5 minutes, excluding comments
 */

public class question2 {

    /**
     * The example contradicts the question - see both functions below.
     */
    public static int[] ints = { 555, 901, 482, 1771, 122, 1 };

    public static void main(String[] args) {
        System.out.println("even/odd number of digits:");
        question();
        System.out.println("even/odd numbers:");
        example();
    }

    /**
     * Example showed to count which numbers are even or odd.
     */
    public static void example() {
        int odd = 0;
        for (int integer : ints) {
            odd += integer % 2;
        }
        System.out.println("Even: " + (ints.length - odd) + "\nOdd: " + odd);
    }

    /**
     * Question asked if the array element had an even or odd number of digits.
     */
    public static void question() {
        int odd = 0;
        for (int integer : ints) {
            odd += (integer + "").length() % 2;
        }
        System.out.println("Even: " + (ints.length - odd) + "\nOdd: " + odd);
    }

}
