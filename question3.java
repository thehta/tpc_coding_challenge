/**
 * @author T.A. Theron - 20700601
 * @version 09-06-2021 - 30 minutes
 */

import java.util.ArrayList;

public class question3 {

    public static Integer[][] ranges = { { 22, 50 }, { 1, 3 }, { 1, 6 }, { 8, 10 }, { 15, 18 }, { 17, 22 } };
    public static ArrayList<Integer[]> rangeList = new ArrayList<Integer[]>();
    public static ArrayList<Integer[]> merged = new ArrayList<Integer[]>();

    public static void main(String[] args) {
        for (Integer[] range : ranges) {
            rangeList.add(range);
        }
        overlaps();
        for (Integer[] range : rangeList) {
            System.out.println("[" + range[0] + " " + range[1] + "]");
        }
    }

    /**
     * Possibly a wasteful implementation, but it gets the job done: On each
     * successive pass of the arraylist, check to see whether a two ranges overlap.
     * If they do, construct a new range and insert it, remove the old ranges from
     * the list.
     */
    public static void overlaps() {
        for (Integer i = 0; i < ranges.length; i++) {
            loop: for (Integer[] range : rangeList) {
                for (Integer[] other : rangeList) {
                    if (range == other) {
                    } else if (range[1] >= other[0] && other[1] > range[1]) {
                        Integer[] newRange = new Integer[2];
                        if (other[0] <= range[0]) {
                            newRange[0] = other[0];
                            newRange[1] = other[1];
                        } else {
                            newRange[0] = range[0];
                            newRange[1] = other[1];
                        }
                        rangeList.add(newRange);
                        rangeList.remove(range);
                        rangeList.remove(other);
                        break loop;
                    }

                }

            }
        }
    }
}