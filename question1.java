/**
 * @author T.A Theron - 20700601
 * @version 08-06-21 - 15 minutes
 */

public class question1 {

    public static double[] fib;

    public static void main(String[] args) {
        try {
            int i = (args.length == 0) ? 100 : Integer.parseInt(args[0]);
            fib = new double[i];
            for (int j = 0; j < i; j++) {
                System.out.print(j + " " + fibonacci(j) + "\n");
            }
        } catch (Exception e) {
            System.out.println("usage: question1 <fibonacci_index>");
        }

    }

    public static double fibonacci(int index) {
        if (index <= 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        /**
         * Calling fibonacci recursively is infeasible for large Fibonacci indices,
         * memoize the calculated values in an array.
         */
        if (fib[index] == 0) {
            double val = fibonacci(index - 1) + fibonacci(index - 2);
            fib[index] = val;
            return val;
        } else
            return fib[index];
    }
}