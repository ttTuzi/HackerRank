package threeMonthPrepareKit.week2;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年09月02日 11:52 PM
 */
public class CountingValley {
    public static void main(String[] args) {
        System.out.println(countingValleys(8,"UDDDUDUU"));
    }


    /**
     * An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly  steps,
     * for every step it was noted if it was an uphill, , or a downhill,  step.
     * Hikes always start and end at sea level, and each step up or down represents a  unit change in altitude.
     * We define the following terms:
     *
     * A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
     * A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
     * Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.
     * @param steps
     * @param path
     * @return
     */
    public static int countingValleys(int steps, String path) {
        // Write your code here
        if(steps<2 && steps>1000000){
            return -1;
        }


        int count = 0;
        int level=0;
        char[] chars = path.toCharArray();
        for (int i = 0; i < steps; i++) {
            if(chars[i]=='U'){
                level++;
                if(level==0){
                    count++;
                }
            }else {
                level--;
            }

        }
        return count;
    }
}
