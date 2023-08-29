package ThreeMonthPrepareKit;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年08月28日 8:38 PM
 */
public class BreakingTheRecord {
    public static void main(String[] args){
        //10 5 20 20 4 5 2 25 1
        List<Integer> input = new ArrayList<>();
        input.add(10);
        input.add(5);
        input.add(20);
        input.add(4);
        input.add(5);
        input.add(2);
        input.add(25);
        input.add(1);
        List<Integer> answer = breakingRecords(input);
        System.out.println(answer.toString());
    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        List<Integer> result = new ArrayList<>();

        Integer min = scores.get(0);
        Integer max =scores.get(0);

        Integer minCount = 0;
        Integer maxCount = 0;
        for (Integer score : scores) {
            if(score>max){
                maxCount+=1;
                max = score;
            }
            if(score<min){
                minCount+=1;
                min =score;
            }
        }

        result.add(maxCount);
        result.add(minCount);
        return result;
    }
}
