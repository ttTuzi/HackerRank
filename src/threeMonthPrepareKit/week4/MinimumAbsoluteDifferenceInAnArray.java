package threeMonthPrepareKit.week4;

import java.util.Comparator;
import java.util.List;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年09月12日 11:44 AM
 */
public class MinimumAbsoluteDifferenceInAnArray {
    public static void main(String[] args) {

    }

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        // Write your code here
        if (arr == null || arr.size() < 2) {
            return 0;
        }

        arr.sort(Comparator.naturalOrder());
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.size() - 1; i++) {
            int diff = Math.abs(arr.get(i) - arr.get(i + 1));
            if (diff < min) {
                min = diff;
            }
        }
        return min;

    }
}
