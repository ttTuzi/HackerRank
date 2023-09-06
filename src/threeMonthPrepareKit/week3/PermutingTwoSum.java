package threeMonthPrepareKit.week3;

import java.util.Comparator;
import java.util.List;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年09月05日 2:33 PM
 */
public class PermutingTwoSum {
    public static void main(String[] args) {

    }

    /**
     * There are two -element arrays of integers, A  and B .
     * Permute them into some  A' and B' such that the relation A'[i] + B'[i]>=k holds for all i where 0<=i<=n.
     *
     * There will be  queries consisting of , , and . For each query, return YES if some permutation ,  satisfying the relation exists. Otherwise, return NO.
     * @param k an integer
     * @param A an array of integers
     * @param B an array of integers
     * @return Yes or No
     */
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
        A.sort(Comparator.naturalOrder());
        B.sort(Comparator.reverseOrder());
        for (int i = 0; i < A.size(); i++) {
            if(A.get(i)+B.get(i)<k){
                return "NO";
            }
        }
        return "YES";
    }
}
