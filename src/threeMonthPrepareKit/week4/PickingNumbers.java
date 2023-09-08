package threeMonthPrepareKit.week4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年09月07日 3:48 PM
 */
public class PickingNumbers {
    public static void main(String[] args) {
        System.out.println(pickingNumbers(Arrays.asList(4, 6, 5, 3, 3, 1)));
    }

    /**
     * Given an array of integers,
     * find the longest subarray where the absolute difference between any two elements is less than or equal to .
     *
     * @param a
     * @return
     */
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        int count = 1;
        int maxCount = 0;
        int i = 0;
        int j = 1;
        Collections.sort(a);
        while (i < a.size() && j<a.size()) {
            if(Math.abs(a.get(i)-a.get(j))<=1){
                j++;
                count++;
            }else {
                i=j;
                j++;
                count = 1;
            }
            maxCount = Math.max(count,maxCount);
        }
        return maxCount;

    }
}
