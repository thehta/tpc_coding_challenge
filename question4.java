/**
 * @author T.A Theron - 20700601
 * @version 09-06-21 - 20 minutes
 */

public class question4 {
    public static void main(String[] args) {
        String numeral = "";
        try {
            numeral = args[0];
        } catch (Exception e) {
            System.out.println("usage: question4 <Roman_Numeral>");
            System.exit(1);
        }

        int sum = 0;
        for (int i = 0; i < numeral.length(); i++) {
            // Match a value to each character
            switch (numeral.charAt(i)) {
                case 'I':
                    // If 'I' is succeded by X or V, take difference. Else, sum.
                    sum += (i + 1 >= numeral.length()) ? 1
                            : (numeral.charAt(i + 1)) == 'X' | (numeral.charAt(i + 1)) == 'V' ? -1 : 1;
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    // If 'X' is succeded by L or C, take difference. Else, sum.
                    sum += (i + 1 >= numeral.length()) ? 10
                            : (numeral.charAt(i + 1)) == 'L' | (numeral.charAt(i + 1)) == 'C' ? -10 : 10;
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    // If 'C' is succeded by D or M, take difference. Else, sum.
                    sum += (i + 1 >= numeral.length()) ? 100
                            : (numeral.charAt(i + 1)) == 'D' | (numeral.charAt(i + 1)) == 'M' ? -100 : 100;
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
                default:
                    break;
            }
        }
        System.out.println(sum);
    }
}
