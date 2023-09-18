package threeMonthPrepareKit.week4;

import java.util.Comparator;
import java.util.List;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年09月12日 1:30 PM
 */
public class MaxMin {
    public static void main(String[] args) {

    }


    public static int maxMin(int k, List<Integer> arr) {
        // Write your code here
        arr.sort(Comparator.naturalOrder());
        int low = 0;
        int high = k-1;
        int res=Integer.MAX_VALUE;
        while(high<arr.size()){
            if(arr.get(high)-arr.get(low)<res){
                res = arr.get(high)-arr.get(low);
            }
            low++;
            high++;
        }
        return res;
    }
}
