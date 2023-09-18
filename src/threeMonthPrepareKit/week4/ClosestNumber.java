package threeMonthPrepareKit.week4;

import java.util.*;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年09月08日 12:15 PM
 */
public class ClosestNumber {
    public static void main(String[] args) {
        System.out.println(closestNumbers(Arrays.asList(-5, 15, 25, 71, 63)));
    }

    public static List<Integer> closestNumbers(List<Integer> arr) {
        // Write your code here
        arr.sort(Comparator.naturalOrder());
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.size()-1; i++) {
            if(arr.get(i+1)-arr.get(i)<min){
                min = arr.get(i+1)-arr.get(i);
                res.clear();
                res.add(arr.get(i));
                res.add(arr.get(i+1));
            }else if(arr.get(i+1)-arr.get(i)==min){
                res.add(arr.get(i));
                res.add(arr.get(i+1));
            }
        }
        return res;

    }
}
