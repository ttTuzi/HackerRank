package threeMonthPrepareKit.week1;

import java.util.*;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年08月29日 4:17 PM
 */
public class SparseArrays {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("ab");
        strings.add("ab");
        strings.add("abc");

        List<String> queries = new ArrayList<>();
        queries.add("ab");
        queries.add("abc");
        queries.add("bc");
        List<Integer> result = matchingStrings(strings,queries);
        System.out.println(result);
    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
//        List<Integer> result = new ArrayList<>();
//
//        for (int i = 0; i < strings.size(); i++) {
//            int count = 0;
//            for (int j = 0; j < queries.size(); j++) {
//                if(strings.get(j).equals(queries.get(i))){
//                    count++;
//                }
//            }
//            result.add(count);
//        }
//        return result;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            int frequency = Collections.frequency(strings, queries.get(i));
            result.add(frequency);

        }
        return result;
    }
}
