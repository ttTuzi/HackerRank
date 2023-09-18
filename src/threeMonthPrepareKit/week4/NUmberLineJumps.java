package threeMonthPrepareKit.week4;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年09月08日 11:29 AM
 */
public class NUmberLineJumps {
    public static void main(String[] args) {
        System.out.println(kangaroo(43,2,70,2));
    }

    /**
     * You are choreographing a circus show with various animals.
     * For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).
     *
     * The first kangaroo starts at location  and moves at a rate of  meters per jump.
     * The second kangaroo starts at location  and moves at a rate of  meters per jump.
     * You have to figure out a way to get both kangaroos at the same location at the same time as part of the show. If it is possible, return YES, otherwise return NO.
     * @param x1
     * @param v1
     * @param x2
     * @param v2
     * @return
     */
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        //3x = 2x+4

        //2x = 3x+5
        int x = x1 - x2;
        int y = v2-v1;
        if( y!=0 && x/y>0 && x%y==0){
            return "YES";
        }
        return "NO";
    }
}
