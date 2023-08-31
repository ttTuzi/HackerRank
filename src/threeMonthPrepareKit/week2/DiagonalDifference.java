package threeMonthPrepareKit.week2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 8/30/2023 9:19 PM
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();

        // Row 1
        List<Integer> row1 = new ArrayList<>();
        row1.add(11);
        row1.add(2);
        row1.add(4);
        matrix.add(row1);

        // Row 2
        List<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);
        matrix.add(row2);

        // Row 3
        List<Integer> row3 = new ArrayList<>();
        row3.add(10);
        row3.add(8);
        row3.add(-12);
        matrix.add(row3);

        int i = diagonalDifference(matrix);
        System.out.println(i);
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int left = 0;
        int right = 0;
        for (int i = 0; i < arr.size(); i++) {
            left = left + arr.get(i).get(i);
            right = right + arr.get(arr.size()-(i+1)).get(arr.size()-(i+1));
        }
        return Math.abs(left-right);
    }
}
