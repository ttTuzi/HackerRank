package threeMonthPrepareKit.week4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年09月12日 11:41 PM
 */
public class StrongPassword {
    public static void main(String[] args) {
        System.out.println(minimumNumber(3,"AUzs-nV"));
    }

    /**
     * Louise joined a social networking site to stay in touch with her friends.
     * The signup page required her to input a name and a password.
     * However, the password must be strong.
     * The website considers a password to be strong if it satisfies the following criteria:
     *
     * Its length is at least .
     * It contains at least one digit.
     * It contains at least one lowercase English character.
     * It contains at least one uppercase English character.
     * It contains at least one special character. The special characters are: !@#$%^&*()-+
     * @param n
     * @param password
     * @return
     */
    public static int minimumNumber(int n, String password) {
        String[] scenarios = {
                ".*\\d.*",                 // At least one digit
                ".*[A-Z].*",              // At least one uppercase letter
                ".*[a-z].*",              // At least one lowercase letter
                ".*[!@#$%^&*()\\-+].*"    // At least one special character from the set [!@#$%^&*()-+]
        };

        int count = 0;
        for (String scenario : scenarios) {
            Pattern pattern = Pattern.compile(scenario);
            Matcher matcher = pattern.matcher(password);
            if (!matcher.find()) {
                count++;
            }
        }

        if(count+password.length()<6){
            return 6-password.length();
        }

        return count;
    }
}
