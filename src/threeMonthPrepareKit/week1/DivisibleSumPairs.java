package threeMonthPrepareKit.week1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年08月29日 3:49 PM
 */
public class DivisibleSumPairs {

    /**
     * Given an array of integers and a positive integer ,
     * determine the number of  pairs where  and  +  is divisible by .
     * @param args
     */
    public static void main(String[] args) {
        //1 3 2 6 1 2
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(1);
        list.add(2);
        int result = divisibleSumPairs(6,3,list);
        System.out.println(result);
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                Integer sum = ar.get(i)+ar.get(j);
                if((sum%k)==0){
                    count++;
                }
            }
        }
        return count;
    }
}
