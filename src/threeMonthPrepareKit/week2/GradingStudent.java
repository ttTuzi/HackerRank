package threeMonthPrepareKit.week2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年08月30日 12:11 PM
 */
public class GradingStudent {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(73);
        list.add(67);
        list.add(33);
        System.out.println(gradingStudents(list));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        for(Integer grade : grades){
            int result = ((grade/5)+1) *5;
            if(result<40){
                list.add(grade);
            }
            else if(result-grade>=3){
                list.add(grade);
            }else {
                list.add(result);
            }
        }
        return list;
    }
}
