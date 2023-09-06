package threeMonthPrepareKit.week3;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年09月06日 1:37 PM
 */
public class MigratoryBirds {
    public static void main(String[] args) {

    }

    /**
     * Given an array of bird sightings where every element represents a bird type id,
     * determine the id of the most frequently sighted type.
     * If more than 1 type has been spotted that maximum amount, return the smallest of their ids.
     * @param arr
     * @return
     */
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Set<Integer> set = new HashSet<>();
        int count=0;
        int res = 0;
        for (int i = 0; i < arr.size(); i++) {
            set.add(arr.get(i));
        }

        for (Integer integer : set) {
            int frequency = Collections.frequency(arr, integer);
            if(frequency>count){
                count = frequency;
                res = integer;
            } else if (count == frequency && res>integer) {
                res = integer;
            }
        }
        return res;
    }
}
