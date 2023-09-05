package threeMonthPrepareKit.week2;

import javax.xml.transform.Result;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年09月01日 11:52 AM
 */
public class CountingSort {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("E:\\HackerRank\\src\\threeMonthPrepareKit\\CountSortTestCase.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fis));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = countingSort(arr);

        System.out.println(result);
        bufferedReader.close();
    }

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> result = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            result.add(0);
        }
        for (int i = 0; i < arr.size(); i++) {
            int index = arr.get(i);
            result.set(index, result.get(index)+1);
        }
        return result;
    }
}
