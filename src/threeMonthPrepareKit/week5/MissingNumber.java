package threeMonthPrepareKit.week5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static threeMonthPrepareKit.week2.CountingSort.countingSort;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年09月14日 2:23 PM
 */
public class MissingNumber {
    public static void main(String[] args) throws IOException {
//        List<Integer> list1 = Arrays.asList(11,4, 11, 7 ,13, 4, 12, 11, 10, 14);
//        List<Integer> list2 = Arrays.asList(11, 4, 11, 7, 3, 7, 10, 13, 4, 8, 12, 11, 10, 14, 12);
        FileInputStream fis = new FileInputStream("src\\threeMonthPrepareKit\\MissingNumberTestCase");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fis));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = missingNumbers(arr, brr);
        bufferedReader.close();
        System.out.println(result);
    }

    /**
     * Given two arrays of integers, find which elements in the second array are missing from the first array.
     * @param arr
     * @param brr
     * @return
     */
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        int i = 0;
        int j = 0;
        arr.sort(Comparator.naturalOrder());
        brr.sort(Comparator.naturalOrder());
        while(i<arr.size() && j<brr.size()){
//            int a = arr.get(i);
//            int b = brr.get(j);
            boolean flag = !arr.get(i).equals(brr.get(j));
            if(flag) {
                if(!res.contains(brr.get(j))) {
                    res.add(brr.get(j));
                }
                j++;
            }else{
                i++;
                j++;
            }
        }
        while (j < brr.size()) {
            if (!res.contains(brr.get(j))) {
                res.add(brr.get(j));
            }
            j++;
        }

        return res;
    }
}
