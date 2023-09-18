package threeMonthPrepareKit.week5;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年09月14日 5:52 PM
 */
public class GridChallenge {
    public static void main(String[] args) {
        String[] grid = {
                "eabcd",
                "fghij",
                "olkmn",
                "trpqs",
                "xywuv",
        };

        String res = gridChallenge(List.of(grid));
        System.out.println(res);

    }

    public static String gridChallenge(List<String> grid) {
        // Write your code here
        for (int i = 0; i < grid.size(); i++) {
            char[] chars = grid.get(i).toCharArray();
            Arrays.sort(chars);
            String newArr = String.valueOf(chars);
            grid.set(i,newArr);
        }

        for (int i = 0; i < grid.get(0).length(); i++) {
            for (int j = 0; j < grid.size()-1; j++) {
                if(grid.get(j).charAt(i)>grid.get(j+1).charAt(i)){
                    return "NO";
                }
            }
        }
        return "YES";
    }
}
