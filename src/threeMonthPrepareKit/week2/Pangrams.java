package threeMonthPrepareKit.week2;

import java.io.CharArrayReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年09月05日 9:20 AM
 */
public class Pangrams {
    public static void main(String[] args) {
        System.out.println(pangrams("qmExzBIJmdELxyOFWv LOCmefk TwPhargKSPEqSxzveiun"));

    }
    public static String pangrams(String s) {
        // Write your code here
        char[] chars = s.replace(" ", "").toLowerCase().toCharArray();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            set.add(chars[i]);
        }
        if(set.size()==26){
            return "pangram";
        }
        return "not pangram";


    }
}
