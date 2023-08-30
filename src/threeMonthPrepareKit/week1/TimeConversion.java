package threeMonthPrepareKit.week1;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年08月28日 3:59 PM
 */


/**
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.
 *
 * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
 * - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 *
 * Example
 *s="12:01:00PM"
 * Return '12:01:00'.
 *
 *s="12:01:00AM"
 * Return '00:01:00'.
 */
public class TimeConversion {
    public static void main(String[] args) {
        String s = TimeConversion("06:40:03AM");
        System.out.println(s);
    }

    public static String TimeConversion(String s){
        //get first 2 string and parse to integer
        String substring = s.substring(0, 2);
        Integer parseInt = Integer.parseInt(substring);

        //suffix
        String suffix = s.substring(s.length() - 2, s.length() );

        Integer preffix = 0;

        String body = s.substring(2, s.length() - 2);
        if(suffix.equals("AM") && parseInt==12){
            return "00"+body;
        }
        else if(suffix.equals("PM") && (parseInt!=12)) {
            preffix = parseInt + 12;
            return preffix.toString()+body;
        }
        else {
            return s.substring(0,s.length()-2);
        }

    }
}
