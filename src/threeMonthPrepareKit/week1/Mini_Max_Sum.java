package threeMonthPrepareKit.week1;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年08月28日 3:36 PM
 */


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Given five positive integers,
 * find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
 * Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 */
public class Mini_Max_Sum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here;
        Collections.sort(arr,Comparator.naturalOrder());
        Long sum =0L;
        for (Integer integer : arr) {
            sum=sum+integer;
        }
        Long resultMin=sum-arr.get(arr.size()-1);
        Long resultMax=sum-arr.get(0);
        System.out.println(resultMin+" "+resultMax);


    }

    public static void main(String[] args) {


    }


}




