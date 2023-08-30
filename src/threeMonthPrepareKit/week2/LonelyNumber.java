package threeMonthPrepareKit.week2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年08月30日 12:01 PM
 */
public class LonelyNumber {
    public static void main(String[] args) {

    }

    public static int lonelyInteger(List<Integer> a) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if(!list.contains(a.get(i))){
                list.add(a.get(i));
            }else {
                list.remove(a.get(i));
            }
        }
        return list.get(0);
    }
}
