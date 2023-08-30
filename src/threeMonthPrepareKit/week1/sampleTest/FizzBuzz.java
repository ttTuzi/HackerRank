package threeMonthPrepareKit.week1.sampleTest;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年08月30日 11:53 AM
 */
public class FizzBuzz {
    public static void main(String[] args) {

    }

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n ; i++) {
            if((i%3==0) && (i%5==0)){
                System.out.println("FizzBuzz");
            }
            else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }

        }
    }
}
