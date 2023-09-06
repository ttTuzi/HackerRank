package threeMonthPrepareKit.week3;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年09月06日 1:21 PM
 */
public class SaleByMatch {
    public static void main(String[] args) {

    }

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Set<Integer> set = new HashSet<>();
        int count=0;
        for (int i = 0; i < n; i++) {
            set.add(ar.get(i));
        }

        for (Integer integer : set) {
            int nums = Collections.frequency(ar, integer);
            count = count + nums/2;
        }
        return count;
    }
}
