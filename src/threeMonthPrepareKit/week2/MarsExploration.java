package threeMonthPrepareKit.week2;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年09月05日 1:58 PM
 */
public class MarsExploration {
    public static void main(String[] args) {

    }

    public static int marsExploration(String s) {
        // Write your code here
        char[] chars = s.toCharArray();
        int i =0;
        int count = 0;
        while(i<s.length()){
            if(chars[i]!='S'){
                count++;
            }
            if(chars[i+1]!='O'){
                count++;
            }
            if(chars[i+2]!='S'){
                count++;
            }
            i+=3;
        }
        return count;


    }
}
