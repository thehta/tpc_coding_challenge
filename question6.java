/**
 * @author T.A. Theron - 20700601
 * @version 09-06-2021 - 3 minutes
 */

public class question6 {

    public static int[] nums = { 0, 1, 2, 3, 5, 2 };

    public static void main(String[] args) {
        int k = 2;
        System.out.println(containsCloseNums(nums, k));
    }

    public static boolean containsCloseNums(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                // Do all the necessary conditions hold?
                if (j != i && nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    return true;
                }
            }
        }
        return false;
    }
}