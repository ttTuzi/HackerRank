package threeMonthPrepareKit.week2;

import org.junit.Test;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年08月30日 1:28 PM
 */
public class FlippingBit {
    public static void main(String[] args) {
        System.out.println(flippingBits(1));
        System.out.println(flippingBits2(1));
        System.out.println(flippingBits(3));
        System.out.println(flippingBits2(3));
    }

    /**
     * You will be given a list of 32 bit unsigned integers.
     * Flip all the bits ( and ) and return the result as an unsigned integer.
     */

    //Way1
    public static long flippingBits(long n) {
        // Write your code here
        String binary = Long.toBinaryString(n);
        while (binary.length() < 32) {
            binary = "0" + binary;
        }
        char[] chars = binary.toCharArray();

        long sum = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='0'){

                sum = sum + (long)(Math.pow(2,chars.length-i-1));
            }
        }
        return sum;
    }

    //way2, better
    public static long flippingBits2(long n){
        return (long)Math.pow(2,32) -n-1;
    }

    @Test
    public void test(){
        String binary = Long.toBinaryString(5);
        System.out.println(binary);
    }
}
