package threeMonthPrepareKit.week3;

import javax.annotation.Resource;
import java.util.*;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年09月07日 9:32 AM
 */
public class MaximumPerimeterTriangle {
    public static void main(String[] args) {

    }


    /**
     *
     * Given an array of stick lengths, use  of them to construct a non-degenerate triangle with the maximum possible perimeter.
     * Return an array of the lengths of its sides as  integers in non-decreasing order.
     *If there are several valid triangles having the maximum perimeter:
     * Choose the one with the longest maximum side.
     * If more than one has that maximum, choose from them the one with the longest minimum side.
     * If more than one has that maximum as well, print any one them.
     * If no non-degenerate triangle exists, return .
     * @param sticks
     * @return
     */

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        // Write your code here
        Collections.sort(sticks);
        for(int i=sticks.size()-1;i>=2;i--){
            int a = sticks.get(i-2);
            int b = sticks.get(i-1);
            int c = sticks.get(i);
            if(a+b>c){
                return Arrays.asList(a,b,c);
            }
        }
        return Arrays.asList(-1);
    }



}
