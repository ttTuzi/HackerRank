package threeMonthPrepareKit.week3;

import java.sql.ClientInfoStatus;
import java.util.List;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年09月05日 2:58 PM
 */
public class SubarrayDivision2 {
    public static void main(String[] args) {

    }

    /**
     *
     * Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.
     *
     * Lily decides to share a contiguous segment of the bar selected such that:
     *
     * The length of the segment matches Ron's birth month, and,
     * The sum of the integers on the squares is equal to his birth day.
     * @param s
     * @param d
     * @param m
     * @return
     */

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int sum = 0;
        int count=0;
        //find first segment of the list
        for(int i = 0 ; i<m; i++){
            sum = sum+ s.get(i);
        }
        if(sum==d) {
            count++;
        }

        //sliding window to find the target
        for (int i = m; i < s.size() ; i++) {
            sum = sum +s.get(i)-s.get(i-m);
            if(sum==d) {
                count++;
            }
        }
        return count;


    }
}
