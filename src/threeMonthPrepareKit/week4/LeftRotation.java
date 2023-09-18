package threeMonthPrepareKit.week4;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年09月07日 9:20 PM
 */
public class LeftRotation {
    public static void main(String[] args) {

    }

    /**
     * A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left.
     * Given an integer,d , rotate the array that many steps left and return the result.
     *
     * example: 2, [1,2,3,4,5] => [3,4,5,1,2]
     * @param d
     * @param arr
     * @return List
     */
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = d; i < arr.size(); i++) {
            res.add(arr.get(i));
        }

        for (int i = 0; i < d; i++) {
            res.add(arr.get(i));
        }

        return res;

    }
}
