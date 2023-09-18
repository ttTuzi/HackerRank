package threeMonthPrepareKit.week4;

import java.util.Arrays;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年09月12日 11:52 AM
 */
public class CaesarCipher {
    public static void main(String[] args) {
        System.out.println(caesarCipher("middle-Outz",2));
    }

    public static String caesarCipher(String s, int k) {
        // Write your code here
        k=k%26;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(chars[i]>='a' && chars[i]<='z'){
                if(chars[i]+k>'z'){
                    chars[i]=(char) (chars[i]-1+k -'z' + 'a');
                }else{
                    chars[i] = (char) (chars[i]+k);
                }
            }

            if(chars[i]>='A' && chars[i]<='Z'){
                if(chars[i]+k>'Z'){
                    chars[i]=(char) (chars[i]-1+k -'Z' + 'A');
                }else{
                    chars[i] = (char) (chars[i]+k);
                }
            }

        }
        return String.valueOf(chars);
    }
}
