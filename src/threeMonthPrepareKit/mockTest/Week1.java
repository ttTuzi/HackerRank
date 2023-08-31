package threeMonthPrepareKit.mockTest;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 8/30/2023 9:14 PM
 */
public class Week1 {
    public static void main(String[] args) {

    }
    public static int findMedian(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr, Comparator.naturalOrder());
        return arr.get(arr.size()/2+1);

    }
}
